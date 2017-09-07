package Functions;
import Engine.Controller;
import boofcv.struct.image.GrayF32;
public class SinusoidDiagonal {
	public SinusoidDiagonal(GrayF32 image, double x, double y, int length, double amplitude, double frequency, double coeff,  boolean direction) {
		if(direction) {
			double xFinal = x + length;
			while ( x < xFinal) {
				double yDouble = amplitude * Math.sin( (frequency * x * Math.PI / 180 ) )*100 + y;
				int x_int = (int)x;
				int y_int = (int)yDouble;
				new Controller(image, x_int, Math.round((float) y_int));
				if(Controller.get()) {
					image.set( x_int,   image.getHeight() - Math.round((float) y_int), 1);
					Controller.set();
				}
				x = x + 1;
				y = y + coeff;
			}
		}
		else {
			double xIniz = x - length;
			while ( x > xIniz) {
				double yDouble = amplitude * Math.sin( (frequency * x * Math.PI / 180 ) )*100 + y;
				int x_int = (int)x;
				int y_int = (int)yDouble;
				new Controller(image, x_int, Math.round((float) y_int));
				if(Controller.get()) {
					image.set( x_int,   image.getHeight() - Math.round((float) yDouble), 1);
					Controller.set();
				}
				x = x - 1;
				y = y + coeff;
			}
		}		
	}
}

