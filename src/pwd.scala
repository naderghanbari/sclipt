#!/usr/bin/env scala

/** Prints current working directory name. */

val systemPropertyCurrentDir = System getProperty "user.dir"
lazy val normalCurrentDir = new java.io.File(".").getCanonicalPath
val directory = Option(systemPropertyCurrentDir) getOrElse normalCurrentDir

println {
  directory
}