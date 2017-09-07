package Functions;
import Engine.Controller;
import boofcv.struct.image.GrayF32;
public class SinusoidHorizontal {
	public SinusoidHorizontal(GrayF32 image, int x, int y, int length, double amplitude, double frequency) {
		double xFinal = x + length;
		while ( x < xFinal) {
			double yDouble = amplitude * Math.sin( (frequency * x * Math.PI / 180 ) )*100 + y;
			new Controller(image, x, Math.round((float) yDouble));
			if(Controller.get()) {
				image.set( x,   image.getHeight() - Math.round((float) yDouble), 1);
				Controller.set();
			}
			x = x + 1;
		}
	}
}
