#!/usr/bin/env scala

/** Counts number of files. */

def asFileStream(fileNames: Array[String]) = fileNames.toStream map (new java.io.File(_))

def fileCount(candidates: Stream[java.io.File]) = candidates count (_.isFile)

lazy val count = fileCount(asFileStream(args))

println {
  s"Total files: $count"
}
