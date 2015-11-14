#!/usr/bin/env scala

/** Lists contents of the current directory. */

val files = new java.io.File(".").listFiles().toStream
val names = files map (_.getName)

names foreach {
  println
}
