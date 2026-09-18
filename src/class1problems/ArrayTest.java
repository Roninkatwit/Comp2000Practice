package class1problems;

/* Shift every element in an array to its own left
 * The original first one will become the last one.
 * [1, 2, 3, 4, 5]
 * [2, 3, 4, 5, 1]
 */
import java.util.Arrays;

public class ArrayTest {
	
	public static void leftShift(int[] a) {
		// 1. Save the first value
		// 2. Start at index 0
		// 3. Copy each value from the right into current
		// 4. Put saved value at the end
		int first = a[0];
		if (a.length > 0) {
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = first;
		}
	}

	public static void rightShift(int[] a) {
		// 1. Save the last value
		// 2. Start at the last index
		// 3. Copy each value from the left into current
		// 4. Put saved value at index 0
		int last = a[a.length - 1];
		if (a.length > 0) {
			for (int i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}
		}
		a[0] = last;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		System.out.println("left shift");
		leftShift(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("right shift");
		rightShift(arr2);
		System.out.println(Arrays.toString(arr2));
		// TESTING PUSH FROM LAPTOP
	}
}
