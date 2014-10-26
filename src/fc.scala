#!/usr/bin/env scala

/** Counts number of files. */

def files = args map (new java.io.File(_)) filter (_.exists) filter (_.isFile)
println(s"Total files: ${files.size}")
