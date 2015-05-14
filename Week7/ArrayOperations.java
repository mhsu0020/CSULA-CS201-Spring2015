import java.util.Random;
import java.util.Scanner;

public class ArrayOperations {
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		
		/*
		 * Ask the user to type in numbers 2.After readin the number, store
		 * that inside the array
		 */
		int[] exampleOne = new int[10];
		for (int i = 0; i < exampleOne.length; i++) {

			System.out.println("Enter a number: ");
			exampleOne[i] = scan.nextInt();

		}
		/* looping through the array and print out the elements */
		for (int i = 0; i < exampleOne.length; i++) {
			System.out.println(exampleOne[i]);
		}
		
		/* Adding up all numbers inside array */
		double[] addUpAll = { 3.5, 6.78, 3.14, 6.28, 12.56 };
		double total = 0;

		for (int i = 0; i < addUpAll.length; i++) {
			total += addUpAll[i];
		}
		System.out.println("total: " + total);
		
		/* Find largest element in array */
		int[] largeList = { -3, -5, -6, -7, -90000, -1 };
		int largest = largeList[0];
		for (int i = 1; i < largeList.length; i++) {
			if (largeList[i] > largest) {
				largest = largeList[i];

			}
		}
		System.out.println("largest: " + largest);
		
		/* Find smallest element in array */
		int[] smallestList = { -3, -5, -6, -7, -90000, -1 };
		int smallest = smallestList[0];
		for (int i = 1; i < smallestList.length; i++) {
			if (smallestList[i] < smallest) {
				smallest = smallestList[i];

			}
		}
		System.out.println("smallest: " + smallest);

		
		/*
		 * Ask users how many numbers they want to enter, Read the numbers,
		 * compute their average, and find out how many numbers are above the
		 * average.
		 */
		System.out.println("How many numbers you want to type in?");
		int numberOfNumbers = scan.nextInt();
		int[] userNumbers = new int[numberOfNumbers];
		double sum = 0;
		for (int i = 0; i < userNumbers.length; i++) {
			System.out.println("enter a number: ");
			int number = scan.nextInt();
			userNumbers[i] = number;
			sum += number;
		}
		double average = sum / numberOfNumbers;
		int numberNumbersAboveAverage = 0;

		for (int i = 0; i < userNumbers.length; i++) {
			if (userNumbers[i] > average) {
				numberNumbersAboveAverage++;
			}
		}
		System.out.println("Average: " + average);
		System.out.println("Number of numbers greater than average: "
				+ numberNumbersAboveAverage);

		/*
		 * Enhanced forloop
		 */
		int[] enhancedForLoopExample = { 1, 2, 3, 4, 5 };
		for (int element : enhancedForLoopExample) {
			// element is the same as enhancedForLoopExample[i]
			System.out.println(element);
		}
		/*
		 * Shift all the elements in the array one position the right, it should
		 * wrap around
		 */
		// ouput should be {5, 1, 2, 3, 4}
		int[] arrayToBeShifted = { 1, 2, 3, 4, 5 };
		int lastElementToWrap = arrayToBeShifted[arrayToBeShifted.length - 1];
		for (int i = arrayToBeShifted.length - 1; i >= 1; i--) {
			arrayToBeShifted[i] = arrayToBeShifted[i - 1];
		}
		arrayToBeShifted[0] = lastElementToWrap;

		for (int i = 0; i < arrayToBeShifted.length; i++) {
			System.out.println(arrayToBeShifted[i]);
		}
		
		/*Shuffle array in random order*/
		int[] arrayToBeShuffled = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arrayToBeShuffled.length - 2; i++) {

			int lastPositionOfArray = arrayToBeShuffled.length - 1;
			int beginIndexOfShuffle = i + 1;

			Random rand = new Random();

			// nextInt is normally exclusive of the top value,
			// so add 1 to make it inclusive
			// int randomNum = rand.nextInt((max - min) + 1) + min;

			int randomIndex = rand
					.nextInt((lastPositionOfArray - beginIndexOfShuffle) + 1)
					+ beginIndexOfShuffle;

			int randomElement = arrayToBeShuffled[randomIndex];

			int temp = arrayToBeShuffled[i];
			arrayToBeShuffled[i] = randomElement;
			arrayToBeShuffled[randomIndex] = temp;

		}
		for (int i = 0; i < arrayToBeShuffled.length; i++) {
			System.out.println(arrayToBeShuffled[i]);
		}

	
		

	

		



	}

}
