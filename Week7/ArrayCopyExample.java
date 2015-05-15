import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {

		// Using sort
		int[] arrayOne = { 3, 4, 1, 2, 5 };
		Arrays.sort(arrayOne);
		System.out.println(Arrays.toString(arrayOne));

		char[] chars = { 'a', 'A', '4', 'F', 'D', 'P' };
		Arrays.sort(chars);
		System.out.println(Arrays.toString(chars));

		// Using arraycopy
		int[] arrayCopyOne = { 1, 2, 3, 4, 5 };
		int[] arrayCopyTwo = new int[arrayOne.length];

		System.arraycopy(arrayCopyOne, 0, arrayCopyTwo, 0, arrayOne.length);

		arrayCopyOne[0] = 9000;
		System.out.println(arrayCopyTwo[0]);

		// Using a forloop to copy the array
		int[] arrayLoopCopyOne = { 1, 2, 3, 4, 5 };
		int[] arrayLoopCopyTwo = new int[arrayOne.length];
		for (int i = 0; i < arrayLoopCopyOne.length; i++) {
			arrayLoopCopyTwo[i] = arrayLoopCopyOne[i];
		}
		arrayLoopCopyOne[0] = 9000;
		System.out.println(arrayLoopCopyTwo[0]);

		/*
		 * Trying to use assginment to copy the array. this will not actually
		 * make a duplicate copy of the array. arrayAssignTwo will point to the
		 * same array as arrayAssignOne is pointing to. When you change
		 * something in arrayAssignOne, it will also affect arrayAssignTwo.
		 */
		int[] arrayAssignOne = { 1, 2, 3, 4, 5 };
		int[] arrayAssignTwo = arrayAssignOne;
		arrayAssignOne[0] = 9000;
		System.out.println(arrayAssignTwo[0]);

	}
}
