#!/usr/bin/env bash
read -p "old extension:" oldext
read -p "new extension:" newext
read -p "The directory:" dir

cd $dir

echo "Operation dir is: {$dir}"

echo "Command bellow will be executed! \n"

echo "rename s/.$oldext/.$newext/ *.$oldext"

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

rename  "s/.$oldext/.$newext/" *.$oldext

echo "done!"


echo "All files with extension $oldext in dir {$dir}  has been modified  to new extension $newext"
