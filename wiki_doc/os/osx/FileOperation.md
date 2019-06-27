## File Operation Shell Command



### osx use tree command 
osx default not install tree tools,but can intstall with brew 

##### intatll tree:

brew install tree

##### how to use tree:

tree --help

##### tree and save to file:

save to html:
tree -H baseHREF -o tree.html


### 1.find file and copy to aimed dir

find . -iname "*.JPG" -or -iname "*.JPEG" -or -iname "*.GIF"| xargs -J % cp -rp % /Users/bailiangjin/Desktop/数据分析/sd_image3

find . -iname "*.jpg" | xargs -J % cp -rp % /Users/bailiangjin/Desktop/数据分析/sd_image3

-type f -name "*.txt"

find .  -name "*.jpg" -exec cp {} /Users/bailiangjin/Desktop/数据分析/sd_image3 \;


find . -regex '\*.jpg' | xargs -J % cp -rp % /Users/bailiangjin/Desktop/数据分析/sd_image3





