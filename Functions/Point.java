package Functions;

import Engine.Controller;
import boofcv.struct.image.GrayF32;

public class Point {
	
	protected int x;
	protected int y;
	
	public Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	}
	
	public Point(Point another_point) {
	    this.x = another_point.get_x();
	    this.y = another_point.get_y();
	}
	
	public void set_x(int x) {
		this.x = x;
	}

	public int get_x() {
		return x;
	}
	
	public void set_y(int y) {
		this.y = y;
	}

	public int get_y() {
		return y;
	}
	
	public boolean checkConsistency(GrayF32 image) {
		Controller check = new Controller(image, x, y);
		return check.get();
	}
}