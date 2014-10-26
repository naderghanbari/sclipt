#!/usr/bin/env scala

/** Filters standard input, keeping only lines matching provided regex. */

val pattern = args(0)
def lines = io.Source.stdin.getLines().toStream
def matched = lines filter (_ matches pattern)
matched foreach println
