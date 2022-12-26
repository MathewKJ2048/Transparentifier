import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
	public static void main(String args[])
	{
		try
		{
			if(args.length==0){System.out.println("error: no file path given");args = new String[]{"./image.png"};}
			Path p = Paths.get(args[0]);
			BufferedImage img = ImageIO.read(p.toFile());
			BufferedImage image = new BufferedImage(
					img.getWidth(), img.getHeight(),
					BufferedImage.TYPE_INT_ARGB);
			int R = 0xFF;
			int G = 0xFF;
			int B = 0xFF;
			if(args.length>1)
			{
				R = Integer.parseInt(args[1]);
				G = Integer.parseInt(args[2]);
				B = Integer.parseInt(args[3]);
			}
			int h = img.getHeight();
			int w = img.getWidth();
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)
			{
				Color c = new Color(img.getRGB(i,j),true);
				int r = c.getRed();
				int b = c.getBlue();
				int g = c.getGreen();
				int a = c.getAlpha();
				if(r==R && b==B && g==G){g=0;a=0;}
				int px = b | g<<8 | r<<16 | a<<24;
				image.setRGB(i,j,px);
			}
			ImageIO.write(image,"png",Paths.get(p.getParent()+"/transparent_"+p.getFileName()).toFile());
		}
		catch (Exception e){e.printStackTrace();}
	}
}
