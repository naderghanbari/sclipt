#!/usr/bin/env scala

/** Counts number of lines in file(s). */

def files = args map (new java.io.File(_)) filter (_.exists) filter (_.isFile)
def counts = files map io.Source.fromFile map (_.getLines) map (_.size)
def pairs = files zip counts map { case (file, size) => s"$file: $size" }
pairs foreach println

def total = (0 /: counts)(_ + _)
println (s"Total lines: $total")
