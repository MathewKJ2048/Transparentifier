# Transparentifier
An open-source tool to remove backgrounds of .png files, written in java.

## Requirements:

Java version 17 or higher is required.
A headless JRE is sufficient since the tool does not use a GUI.

## Use:

1) Download **transparentifier.jar** from [here]().  
2) Run the following command to replace all pixels in `<fname>.png` with color **(r,g,b)** with a transparent pixel:  

```
java -jar transparentify.jar <fname>.png <r> <g> <b>
```

Where `<fname>` is the relative path of the target file w.r.t transparentifier.jar and `<r>`, `<g>` and `<b>` represent the color (r,g,b)  
0 <= r, g, b <= 255  

3) The result is stored with the name `transparent_<fname>.png` in the same location as the original file.


