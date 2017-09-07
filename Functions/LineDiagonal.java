package Functions;
import Engine.Controller;
import boofcv.struct.image.GrayF32;
public class LineDiagonal {
	public LineDiagonal(GrayF32 image, double x, double y, double length, double coeff, boolean direction) {
		if(direction) {
			double xLength =  length / ( Math.sqrt( 1 + ( coeff * coeff ) ) );
			double xFinal = xLength + x;
			while ( x < xFinal) {
				int x_int = (int)x;
				int y_int = (int)y;
				new Controller(image, x_int, y_int);
				if(Controller.get()) {
					image.set(x_int,  image.getHeight() - y_int, 1);
					Controller.set();
				}
				x = x + 1;
				y = y + coeff;
			}
		}
		else {
			double xLength =  length / ( Math.sqrt( 1 + ( coeff * coeff ) ) );
			double xIniz = x - xLength;
			while ( x > xIniz) {
				int x_int = (int)x;
				int y_int = (int)y;
				new Controller(image, x_int, y_int);
				if(Controller.get()) {
					image.set(x_int,  image.getHeight() - y_int, 1);
					Controller.set();
				}
				x = x - 1;
				y = y - coeff;
			}
		}
	}
}