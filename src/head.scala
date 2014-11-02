#!/usr/bin/env scala

/** Display 10 first lines of a file. */

def files = args map (new java.io.File(_)) filter (_.exists) filter (_.isFile)
def lines = files map io.Source.fromFile map (_.getLines) map (_.toStream)  map (_.take(10))
files zip lines foreach {
  case (file, lines) =>
    println(s"==> ${file.getCanonicalPath} <==")
    lines foreach println
}
