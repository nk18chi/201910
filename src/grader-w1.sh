#!/bin/bash
#
# Grader for Java Exercises. Copyright (c) 2019, itzderr
# -y: Ouput in two columns.

bold=$(tput bold)
normal=$(tput sgr0)

for file in Week1/*/*.java; do
  echo >&2 -e "🧪  ${bold}Testing $file\n${normal}"
  javac "$file"

  file="${file%.java}"
  infile="tests/${file#Week1/}.in"
  [ -f "$infile" ] || infile=/dev/null
  outfile="tests/${file#Week1/}.out"
  [ -f "$outfile" ] || continue;

  java "${file//\//.}" < "$infile" | diff -w -B --strip-trailing-cr $1 - "$outfile"
  if [ $? -ne 0 ]; then
    echo -e "\n❌\n";
  else
    echo -e "\n✅\n";
  fi

  # Uncomment this line to create output files.
  # java "${file//\//.}" < "$infile" > $outfile
done
