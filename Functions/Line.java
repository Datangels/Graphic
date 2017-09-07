package Functions;
import boofcv.struct.image.GrayF32;

public class Line {
	public Line(GrayF32 image, Point a, Point b, int thickness) {
		double delta_x = b.get_x() - a.get_x();
		double delta_y = b.get_y() - a.get_y();
		double distance = Math.sqrt(Math.pow(delta_x, 2) + Math.pow(delta_y, 2));
		double slope = delta_y / delta_x;
		for (int i = 0; i < thickness; i++) {
			for (int q = 0; q < thickness; q++) {
				if (a.get_x() < b.get_x()) {
					new LineDiagonal(image, a.get_x() + i, a.get_y() + q, distance, slope, true);
				}
				else {
					new LineDiagonal(image, a.get_x() + i, a.get_y() + q, distance, slope, false);
				}
			}
		}
	}
}