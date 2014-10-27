#!/usr/bin/env scala

/** Concatenates and prints file contents. */

def files = args map (new java.io.File(_)) filter (_.exists) filter (_.isFile)
def lines = files map io.Source.fromFile map (_.getLines) flatMap (_.toStream)
lines foreach println
