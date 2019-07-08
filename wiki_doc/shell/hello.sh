#!/usr/bin/env bash

root_dir=0
echo "root_dir=$root_dir"
read -p "Please enter search dir > " search_dir

if [ ! -n "$search_dir" ] ;then
echo "you have not input a search_dir!"
exit

elif[[ $search_dir = $root_dir]]  then
echo "invalide search_dir"
exit

else
echo "the word you input is $search_dir"
exit
fi

