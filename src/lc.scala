#!/usr/bin/env scala

/** Counts number of lines in file(s). */

def files = args map (new java.io.File(_)) filter (_.exists) filter (_.isFile)
def lines = files map io.Source.fromFile map (_.getLines) map (_.size)
def counts = files zip lines map { case (file, size) => s"$file: $size" } 
counts foreach println	

def total = (0 /: lines)(_ + _)
println (s"Total lines: $total")
