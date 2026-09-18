package generics;

public class genericsTest {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>(1);
		System.out.println(b1.getData());
		b1.setData(2);
		System.out.println(b1.getData());

	}

}
