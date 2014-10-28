#!/usr/bin/env scala

/** Lists contents of the current directory. */

def files = new java.io.File(".").listFiles()
def names = files map (_.getName)
names foreach println
