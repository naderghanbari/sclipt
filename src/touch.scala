#!/usr/bin/env scala

/** Creates files if not existing. */

def files = args map (new java.io.File(_))
files foreach (_.createNewFile())