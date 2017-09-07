package Functions;
import Engine.Controller;
import boofcv.struct.image.GrayF32;
public class SinusoidVertical {
	public SinusoidVertical(GrayF32 image, int x, int y, int length, double amplitude, double frequency) {
		double yFinal = y + length;
		while ( y < yFinal) {
			double xDouble = amplitude * Math.sin( (frequency * y * Math.PI / 180 ) )*100 + x;
			new Controller(image, Math.round((float) xDouble), y);
			if(Controller.get()) {
				image.set( Math.round((float) xDouble), y , 1);
				Controller.set();
			}
			y = y + 1;
		}
	}
}
