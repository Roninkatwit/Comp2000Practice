package class1problems;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;

	/** Construct a default geometric object */
	protected GeometricObject() {
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/** Return a string representation of this object */
	public String toString() {
		return "color: " + color + " filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getVolume();
}
