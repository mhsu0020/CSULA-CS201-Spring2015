public class StringExamples {

	public static int generateRandomNumbers(int startingNumber, int endingNumber) {

		int randomNumber = 0;

		randomNumber = (int) (startingNumber + Math.random() * endingNumber);

		return randomNumber;

	}

	public static char getRandomCharacterFromString(String inputString) {

		// First, generate a random int that is a index of a character in the
		// string

		int randomPosition = generateRandomNumbers(0, inputString.length());

		return inputString.charAt(randomPosition);

	}

	public static void main(String[] args) {

		// long way
		// String s1 = new String("test string");

		String s2 = "fun class";
		System.out.println("length of String: " + s2.length());
		 //most programming languages use zero based indexing
		System.out.println("first character: " + s2.charAt(0));
		System.out.println("last character: " + s2.charAt(8));

		String s3 = "asdsadsad sad sa dsad sa dsa dsa d sad sa dsa";
//		System.out.println("last character of s3: "
//				+ s3.charAt(s3.length() - 1));
//		System.out.println("random character in 'hello': "
//				+ getRandomCharacterFromString("hello"));

		//String is immutable, so rassign reference
		s2 = s2.toUpperCase();
		//System.out.println(s2);
		
		String s4 = String.valueOf(3000);
		//System.out.println(s4);
		
		String s5  ="very very tired";
		
		System.out.println(s5.substring(5));
		
		System.out.println(s5.indexOf("tired"));
		



		
		
	}

}
