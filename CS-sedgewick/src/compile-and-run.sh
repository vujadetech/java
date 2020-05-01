#!/bin/sh

javac -cp .:stdlib.jar $1 
Name=$(echo $1 | cut -d'.' -f 1)
shift
java -cp .:stdlib.jar  $Name "$@" 


