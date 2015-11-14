#!/usr/bin/env scala

/** Creates files if not existing. */

def asFileStream(fileNames: Array[String]) = fileNames.toStream map (new java.io.File(_))

def nonExistingFiles(candidates: Stream[java.io.File]) = candidates filterNot (_.exists)

nonExistingFiles(asFileStream(args)) foreach {
  _.createNewFile
}