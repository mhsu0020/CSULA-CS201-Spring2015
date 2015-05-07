public class SampleMidterm {

	public static void upsideDownTriangle(int number) {

		for (int i = number; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

	public static String withoutX(String input) {
		/*
		 * If the input begins with or ends with the character Z
		 */
		// /if(input.startsWith("z") || input.endsWith("z"))
		if (input.charAt(0) == 'z' || input.charAt(input.length() - 1) == 'z') {
			return input.replace("z", "");

		} else {
			return input;

		}

	}

	public static void main(String[] args) {

		SampleMidterm.upsideDownTriangle(8);

	}

}
