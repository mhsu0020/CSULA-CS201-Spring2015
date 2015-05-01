public class MultiplicationTable {

	// print out multiplication table
	public static void printMultiplicationTable(int maxRowAndColumn) {

		for (int rowNumber = 1; rowNumber <= maxRowAndColumn; rowNumber++) {

			for (int columnNumber = 1; columnNumber <= maxRowAndColumn; columnNumber++) {

				System.out.print(" " + rowNumber * columnNumber);
				//
			}
			System.out.println();

		}

	}

	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public static void printTriangle(int baseOfTriangle) {
		for (int rowNumber = 1; rowNumber <= baseOfTriangle; rowNumber++) {

			for (int asteriskCounter = 1; asteriskCounter <= rowNumber; asteriskCounter++) {

				System.out.print("*");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {

		MultiplicationTable.printMultiplicationTable(12);
		MultiplicationTable.printTriangle(12);

	}

}
