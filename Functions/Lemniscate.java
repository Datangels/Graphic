package Functions;
import Engine.Controller;
import boofcv.struct.image.GrayF32;
public class Lemniscate {
	public Lemniscate(GrayF32 image, int xStart, int yStart, double a, int limit) {
		double pow = Math.pow(a, 2);
		for (double t = 0; t < limit; t+=0.001) {
			double x = ( pow * Math.cos(t) ) / ( 1 + Math.pow(Math.sin(t), 2)) + xStart;
			double y = ( pow * Math.cos(t) * Math.sin(t)) / ( 1 + Math.pow(Math.sin(t), 2)) + yStart;
			new Controller(image, Math.round((float) x), (int) y);
			if(Controller.get()) {
				image.set( Math.round((float) x), (int) y , 1);
				Controller.set();
			}
		}
	}
}
