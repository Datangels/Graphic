package Functions;
import boofcv.struct.image.GrayF32;

public class Vertical_Line extends Function {

	public Vertical_Line(int x, int y, int length, int thickness) {
		super(x, y, length, thickness);
	}
	
	public GrayF32 drawFunction(GrayF32 image) {
		for (int i = 0; i < thickness; i++) {
			int counter = y;
			while ( y < (y + length) ) {
				Point point = new Point(x + i, counter);
				if(point.checkConsistency(image)) {
					image.set(x + i, image.getHeight() - counter, 1);
				}
				else {
					break;
				}
				counter++;
			}
		}
		return image;
	}
}
