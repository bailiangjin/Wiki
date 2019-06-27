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

find . -name "*.jpg" | xargs -J % cp -rp % /Users/bailiangjin/Desktop/sd_image




