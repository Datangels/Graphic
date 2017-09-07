package Functions;
import Engine.Controller;
import boofcv.struct.image.GrayF32;
public class LineHorizontal {
	public LineHorizontal(GrayF32 image, int xStart, int xEnd, int yStart) {	
		while ( xStart < xEnd) {
			new Controller(image, xStart, yStart);
			if(Controller.get()) {
				image.set(xStart, image.getHeight() - yStart, 1);
				Controller.set();
			}
			xStart = xStart + 1;
		}
	}
}