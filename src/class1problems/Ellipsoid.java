package class1problems;

public class Ellipsoid extends GeometricObject implements Comparable<Ellipsoid>{
	private int a, b,c;
	
	public Ellipsoid(String color, boolean filled, int a, int b, int c) {
		// YOUR CODES
	}
	
	@Override
	public double getVolume() {
		// YOUR CODES
		return 0;
	}
	
	public boolean isSphere() {
		// YOUR CODES
		return false;
	}
	
	public String toString() {
		// YOUR CODES
		return null;
	}

	@Override
	public int compareTo(Ellipsoid other) {
		// YOUR CODES
		return 0;
	}
}
