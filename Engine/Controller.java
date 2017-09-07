package Engine;
import boofcv.struct.image.GrayF32;

public class Controller {
	
	protected static boolean isPrintable = false; 
	
	public Controller(GrayF32 image, int xStart, int yStart) {
		
		int heigth = image.height;
		int width = image.width;
		if( xStart < width )
			if( yStart < heigth )
				if( xStart > 0 )
					if( yStart > 0 )
						this.isPrintable = true;
	}
	
	public static boolean get() {	
		return isPrintable;
	}
	
	public static void set() {	
		isPrintable = false;
	}
}