package class1problems;

public class Cuboid extends GeometricObject implements Comparable<Cuboid> {
	private double length, width, height;

	public Cuboid(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public Cuboid(String color, boolean filled, double length, double width, double height) {
		super(color, filled);
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public double getVolume() {
		return this.length * this.height * this.width;
		// using this keyword explicitly references object's instance fields 
		// it would work with out without it in this situation
		// only matters if local variable and param share the same name
	}
	
	public boolean isCube() {
		if (length == width && width == height) {
			return true;
		} 
		return false;
	}
	
	

	@Override
	public int compareTo(Cuboid other) {
		if (this.getVolume() > other.getVolume()) {
			return 1;
		}
		else if (this.getVolume() == other.getVolume()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nlenght " + length + "\nwidth " + width + "\nheight " + height;
	}
	
	
}