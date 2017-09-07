package Extractor;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import boofcv.gui.image.VisualizeImageData;
import boofcv.io.image.UtilImageIO;
import boofcv.struct.image.GrayF32;
public class Picture {
	public Picture(GrayF32 image) {
		BufferedImage out = VisualizeImageData.grayMagnitude(image,null,-1);
		Date dNow = new Date();
	    SimpleDateFormat date = new SimpleDateFormat ("yyyy_MM_dd_hh_mm");
		UtilImageIO.saveImage(out, "/home/robimalco/Desktop/Graphic/" + date.format(dNow) + System.currentTimeMillis() + ".jpg");
	}
	
}