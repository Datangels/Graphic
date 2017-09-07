package Gif;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Test {
	public static void main(String[] args) throws IOException {
		AnimatedGifEncoder e = new AnimatedGifEncoder();
		e.start("C:/Users/admin/Desktop/test/mamma.gif");
		e.setDelay(100);   // 1 frame per sec
		e.setRepeat(1000);
		File folder = new File("C:/Users/admin/Desktop/test");
		File[] listOfFiles = folder.listFiles();
		int cont = 0;
		for (File file : listOfFiles) {
			BufferedImage img_1 = ImageIO.read(file);
			e.addFrame(img_1);
			System.out.println(listOfFiles.length - cont);
			cont++;
		}
		e.finish();
	}
}

