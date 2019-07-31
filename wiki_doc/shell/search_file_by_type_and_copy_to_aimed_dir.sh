#!/usr/bin/env bash 

read -p "Please enter search dir > " search_dir
echo "Search DIR： $search_dir"

read -p "Please enter aimed dir > " aimed_dir
echo "Aimed DIR： $aimed_dir"

read -p "Enter file type, such as .jpg> " file_type
echo "File Type To Search：$file_type"

echo "Command bellow will be executed! \n"
echo "find $search_dir -iname *$file_type | xargs -J % cp -rp % $aimed_dir"

read -r -p "Are You Sure? [Y/n] " input

case $input in

[yY][eE][sS]|[yY])
echo "executing ..."
;;

[nN][oO]|[nN])
echo "You hava canceled the task! Bye Bye!"
;;

*)
echo "Invalid input..."
exit 1
;;
esac


find $search_dir -iname "*${file_type}"| xargs -J % cp -rp % $aimed_dir

echo "done!"





