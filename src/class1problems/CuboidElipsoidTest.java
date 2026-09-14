package class1problems;

public class CuboidElipsoidTest {

	public static void main(String[] args) {

		Cuboid c1 = new Cuboid("Red", true, 10.0, 10.0, 10.0);
		Cuboid c2 = new Cuboid("Green", false, 10.0, 10.2, 10.0);
		System.out.println(c1.toString());
		System.out.println(c1.compareTo(c2));
		Ellipsoid e1 = new Ellipsoid("Blue", true, 11, 10, 5);
		Ellipsoid e2 = new Ellipsoid("Yellow", false, 13, 10, 5);
		System.out.println(e1.compareTo(e2));

	}

}
