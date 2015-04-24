public class StringComparison {

	public static void main(String[] args) {


		String str1 = new String("abc");
		String str2 = new String("abc");

		String str3 = new String("aaz");
		
		
		
		String str4 = "abc";
		String str5 = "abc";

		//This is false
		System.out.println(str4==str5);
		
		//This is true because java interns string literals to save memory space
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));

	}

	
}
