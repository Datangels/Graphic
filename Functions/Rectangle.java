package Functions;
import boofcv.struct.image.GrayF32;
public class Rectangle {
	public Rectangle(GrayF32 image, int x, int y, int witdh, int heigth) {
		new LineHorizontal(image, x, x + witdh, y);
		new LineHorizontal(image, x, x + witdh, y + heigth);
		new LineVertical(image, y, y + heigth, x);
		new LineVertical(image, y, y + heigth, x + witdh);
	}
}