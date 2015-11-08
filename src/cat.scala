#!/usr/bin/env scala

/** Concatenates and prints file contents. */

def asFileStream(fileNames: Array[String]) = fileNames.toStream map (new java.io.File(_))

def existingFiles(candidates: Stream[java.io.File]) = candidates filter (_.isFile)

def lineStream(file: java.io.File) = io.Source.fromFile(file).getLines().toStream

lazy val lines = existingFiles(asFileStream(args)) flatMap lineStream

lines foreach {
  println
}
