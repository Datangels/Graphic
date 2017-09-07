package Functions;
import boofcv.struct.image.GrayF32;

public class Function {
	
	protected int x;
	protected int y;
	protected int length;
	protected int thickness;
	
	public Function(int x, int y, int length, int thickness) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.thickness = thickness;
	}
	
	public GrayF32 drawFunction(GrayF32 image) {
		return image;
	}
	
	public int get_x() {
		return x;
	}
	
	public int get_y() {
		return y;
	}
	
	public int get_length() {
		return length;
	}
	
	public int get_thickness() {
		return thickness;
	}
	
	public void set_x(int x) {
		this.x = x;
	}
	
	public void set_y(int y) {
		this.y = y;
	}
	
	public void set_length(int length) {
		this.length = length;
	}
	
	public void set_thickness(int thickness) {
		this.thickness = thickness;
	}
}
