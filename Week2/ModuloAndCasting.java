public class ModuloAndCasting {
	public static void main(String[] args) {
			
			System.out.println("1 modulus 2 should return 1 cause 2 is greater than 1: ");
		    System.out.println(1%2);
		
		    System.out.println("2 modulus 2");
		    System.out.println(2%2);
			
			System.out.println("integer division");
		    System.out.println(1/20);
		    System.out.println(3/2);
			
			System.out.println("Mixed integer decimal division");
			System.out.println(3/2.0);
			
			System.out.println("implicit casting");
			double doubleOne = 2;
			System.out.println(doubleOne);
			
			System.out.println("explicit casting");
			int x;
			x = (int) 100.0 ;
			System.out.println(x);
			
			System.out.println("explicit casting augmented expression");
			int y;
			y = (int) (100.0 / 20);
			System.out.println(y);
			
			System.out.println("preincrement complicated");
			int i = 10;
			int k = i+++i;
			System.out.println(k);
			
			
			
			


			
			
		}
}
