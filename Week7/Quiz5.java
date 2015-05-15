public class Quiz5 {
	/*
	 * Write a complete java program that does the following:
1. Create a array of size 5
2. Fill the array with different values, you can hard code it
3. Print out the contents of the array
4. Use a loop to take the square root of each element in the array, and update the element
5. Print out the new contents of the array
	 * 
	 * */
	public static void main(String[] args) {

		double[] myArray = new double[5];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=i;
		}
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		for (int i = 0; i < myArray.length; i++) {

			myArray[i] = Math.sqrt(myArray[i]);
		
		}
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}

}
