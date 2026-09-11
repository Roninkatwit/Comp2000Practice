package class1problems;

public class CuboidElipsoidTest {

	public static void main(String[] args) {

		Cuboid c1 = new Cuboid(10.0, 10.0, 10.0);
		System.out.println(c1.toString());
		System.out.println(c1.compareTo(c1));
		Ellipsoid e1 = new Ellipsoid("Blue", true, 10, 10, 5);
		
	}

}
