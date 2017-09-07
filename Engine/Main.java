package Engine;
import java.io.IOException;
import Extractor.Picture;
import Functions.Fourier;
import boofcv.struct.image.GrayF32;
import java.util.concurrent.ThreadLocalRandom;

import org.jcodec.common.ArrayUtil;

public class Main {
	public static void main( String args[] ) throws IOException {
		int pixelX = 9200;
		int pixelY = 7400;
		int length = 20000;
		GrayF32 image = new GrayF32(pixelX, pixelY);
		
		for (int s = 1; s < 50; s++) {//righe
			double[] array_amptitude = {ThreadLocalRandom.current().nextDouble(1 - 0.02 - 0.001, 1 + 0.02), ThreadLocalRandom.current().nextDouble(1 - 0.04 - 0.001, 1 + 0.04), ThreadLocalRandom.current().nextDouble(1 - 0.06 - 0.001, 1 + 0.06)};
			double[] array_frequency = {ThreadLocalRandom.current().nextDouble(1 - 0.02 - 0.001, 1 + 0.02), ThreadLocalRandom.current().nextDouble(1 - 0.04 - 0.001, 1 + 0.04), ThreadLocalRandom.current().nextDouble(1 - 0.06 - 0.001, 1 + 0.06)};
			double[] array_dividendum = {ThreadLocalRandom.current().nextDouble(1 - 0.02 - 0.001, 1 + 0.02), ThreadLocalRandom.current().nextDouble(1 - 0.04 - 0.001, 1 + 0.04), ThreadLocalRandom.current().nextDouble(1 - 0.06 - 0.001, 1 + 0.06)};
			for (int i = 0; i < 35; i++) {
				int x_position = 0 - ThreadLocalRandom.current().nextInt(-3000, -1);;
				int y_position = i + s * 400;
				new Fourier(image, x_position, y_position, length, array_amptitude, array_frequency, array_dividendum);
			}
		}
		new Picture(image);
	}
	public static double[] concat(double[]... arrays) {
	    int length = 0;
	    for (double[] array : arrays) {
	        length += array.length;
	    }
	    double[] result = new double[length];
	    int pos = 0;
	    for (double[] array : arrays) {
	        for (double element : array) {
	            result[pos] = element;
	            pos++;
	        }
	    }
	    return result;
	}
}

		
//double[] array_frequency = {1.1 + s * 0.05, 0.8 + s * 0.1};
//double[] array_dividendum = {3 + s * 0.05, 0.8 + s * 0.1};
		


//double rdm_12 = ThreadLocalRandom.current().nextDouble(min, max);
//public Fourier(GrayF32 image, int x, int y, intength, double[] array_amptitude, double[] array_frequency, double[] array_dividendum) 