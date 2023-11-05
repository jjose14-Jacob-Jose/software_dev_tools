#!/bin/sh
# Convert all PNG files in the /input directory to ICO and move them to /output
for file in /input/*.png; do
    filename=$(basename -- "$file")
    extension="${filename##*.}"
    filename="${filename%.*}"
    convert "$file" "/output/$filename.ico"
done
