#!/usr/bin/env scala

/** Prints current working directory name. */

def directory = new java.io.File(".").getCanonicalPath
println(directory)