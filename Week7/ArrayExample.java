public class ArrayExample {

	public static void main(String[] args) {

		int[] myArray = new int[10];
		System.out.println("length: " + myArray.length);
		System.out.println("element at index 4: " + myArray[4]);
		myArray[4] = 9000;
		System.out.println("element at index 4: " + myArray[4]);

		/*
		 * Retrieve the element at position 4, and then increment it by 1
		 */
		myArray[4]++;

		System.out.println("element at index 4: " + myArray[4]);

		// Short hand literal to populate values
		int exampleVariable = 200;
		double[] mySecondArray = { 1, 2, 3, 4, 5, 10, exampleVariable, 9000 };
		System.out.println(mySecondArray[6]);
	}

}
