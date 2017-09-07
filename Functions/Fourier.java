package Functions;
import Engine.Controller;
import boofcv.struct.image.GrayF32;
public class Fourier {
	public Fourier(GrayF32 image, int x, int y, int length, double[] array_amptitude, double[] array_frequency, double[] array_dividendum) {
		double xFinal = x + length;
		while ( x < xFinal) {
			double yDouble = array_amptitude[0] * Math.sin(array_frequency[0] * x * Math.PI / 180) * 100 / array_dividendum[0] + y;
			for (int i = 1; i < array_frequency.length; i++) {
				yDouble = yDouble + array_amptitude[i] * Math.sin(array_frequency[i] * x * Math.PI / 180) * 100 / array_dividendum[i];
			}
			new Controller(image, x, Math.round((float) yDouble));
			if(Controller.get()) {
				image.set( x,   image.getHeight() - Math.round((float) yDouble), 1);
				Controller.set();
			}
			x = x + 1;
		}
	}
}
