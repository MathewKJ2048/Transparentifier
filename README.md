# Transparentifier
An open-source tool to remove backgrounds of .png files, written in java.

## Requirements:

Java version 17 or higher is required.
A headless JRE is sufficient since the tool does not use a GUI.

## Use:

1) Download **transparentifier.jar** from [here]().  
Run the following command to replace all pixels in `<fname>.png` with color **(r,g,b)** with a transparent pixel:  

```
java -jar transparentify.jar <fname>.png <r> <g> <b>
```


