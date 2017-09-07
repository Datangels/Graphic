package Utilities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import boofcv.io.image.UtilImageIO;

public class Main {
	public static void main(String[] args) throws IOException {
		
		String file_input = "C:/Users/roberto.malcotti/Desktop/pictures/natale/papaOKOK.jpg";
		String file_output = "C:/Users/roberto.malcotti/Desktop/pictures/natale/link.jpg";
		
		//ufferedImage img = ImageIO.read(new File(file_input));
		//SizeChanger test = new SizeChanger(img, 500, 0, 3000, 4000);
		//img = test.get_image();
		BufferedImage img = new DimensionRatioChanger().scaleImage(1400,425,file_input);
		System.out.println(img.getHeight() + "  " + img.getWidth());
		UtilImageIO.saveImage(img, file_output);
		System.out.println("Image correctely processed and saved");

	}
}
//BufferedImage img = new ImgUtils().scaleImage(2461,4000,"C:/PATH.jpg");
//UtilImageIO.saveImage(img, "C:/PATH.jpg");