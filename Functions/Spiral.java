package Functions;
import Engine.Controller;
import boofcv.struct.image.GrayF32;
public class Spiral {
	public Spiral(GrayF32 image, int xStart, int yStart, double a, double b, int limit) {
		for (double r = 0.01; r < limit; r+=0.01) {
			double phi = Math.log(r/a) / Math.log(b);
			double x = r * Math.cos(phi) + xStart;
			double y = r * Math.sin(phi)+ yStart;
			new Controller(image, Math.round((float) x), (int) y);
			if(Controller.get()) {
				image.set( Math.round((float) x), (int) y , 1);
				Controller.set();
			}
//			else {
//				break;
//			}
		}
	}
}
