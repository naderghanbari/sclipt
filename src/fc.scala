#!/usr/bin/env scala

/** Counts number of files. */

def asFileStream(fileNames: Array[String]) = fileNames.toStream map (new java.io.File(_))

def fileCount(candidates: Stream[java.io.File]) = candidates count (_.isFile)

val fs = asFileStream(args)
val count = fileCount(fs)

println {
  s"Total files: $count"
}
