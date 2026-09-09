package class1problems;

/* Shift every element in an array to its own left
 * The original first one will become the last one.
 * [1, 2, 3, 4, 5]
 * [2, 3, 4, 5, 1]
 */
import java.util.Arrays;

public class ArrayTest {
	public static void leftShift(int[] a) {
		if (a.length > 0) {
			int first = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = first;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 0, 8, 10 };
		System.out.println(Arrays.toString(arr));
		leftShift(arr);
		System.out.println(Arrays.toString(arr));
	}
}
