package Utilities;
import boofcv.io.image.UtilImageIO;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class SizeChanger {
	
	BufferedImage image_modfied;

	public SizeChanger(BufferedImage image, int x_start, int y_start,  int x_end, int y_end) throws IOException {
		
		image_modfied = image.getSubimage(x_start, y_start, x_end, y_end);
		
	}
	
	public BufferedImage get_image() {
		return image_modfied;
	}
}