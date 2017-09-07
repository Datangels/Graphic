package Functions;
import Engine.Controller;
import boofcv.struct.image.GrayF32;
public class LineVertical {
	public LineVertical(GrayF32 image, int y, int yEnd, int x) {
		while ( y < yEnd ) {
			new Controller(image, x, y);
			if(Controller.get()) {
				image.set(x, image.getHeight() - y, 1);
				Controller.set();
			}
			y = y + 1;
		}
	}
}