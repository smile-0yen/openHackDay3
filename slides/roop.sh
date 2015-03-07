#!/bin/sh

javac Rand.java
while [ 1 ]; do java Rand > input; java Rand > /dev/null; done
