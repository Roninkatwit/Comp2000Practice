package class1problems;

public class Ellipsoid extends GeometricObject implements Comparable<Ellipsoid> {
	private int a, b, c;

	public Ellipsoid(String color, boolean filled, int a, int b, int c) {
		super(color, filled);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getVolume() {
		return (4.0 / 3.0) * Math.PI * (a * b * c);
	}

	public boolean isSphere() {
		if (a == b && b == c) {
			return true;
		}
		return false;
	}

	public void reshape() {
		a *= 2;
		b *= 2;
		c /= 2;
	}

	public String toString() {
		return super.toString() + "\n a " + a + "\n b " + b + "\n c " + c;
	}

	@Override
	public int compareTo(Ellipsoid other) {
		if (this.getVolume() > other.getVolume()) {
			return -1;
		} else if (this.getVolume() == other.getVolume()) {
			return 0;
		} else {
			return 1;
		}
	}
}
