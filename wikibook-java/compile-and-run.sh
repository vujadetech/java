#!/bin/sh

javac $1
Name=$(echo $1 | cut -d'.' -f 1)
shift
java $Name "$@" 


