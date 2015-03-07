#!/bin/sh

javac Rand.java
while [ 1 ]; do java Rand | tee input; java Rand > /dev/null; done
