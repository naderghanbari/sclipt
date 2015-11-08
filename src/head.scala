#!/usr/bin/env scala

/** Display 10 first lines of a file. */

def asFileStream(fileNames: Array[String]) = fileNames.toStream map (new java.io.File(_))

def existingFiles(candidates: Stream[java.io.File]) = candidates filter (_.isFile)

def lineStream(file: java.io.File) = io.Source.fromFile(file).getLines().toStream

val fs = existingFiles(asFileStream(args))
val lss = fs map lineStream

fs zip lss foreach { case (f, ls) =>
  println {
    s"==> ${f.getCanonicalPath} <=="
  }
  ls take 10 foreach println
}
