public class SemiColonAfterIf {

	public static void main(String[] args) {

		int i = 100;
		/*
		 * semi colon after if, whatever is inside the braces block gets
		 * executed, doesn't matter what the condition evaluates to
		 */
		if (i < 1);
		{

			System.out.println("i is less than 1");
		}

	}

}
