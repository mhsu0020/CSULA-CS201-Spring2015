import java.util.Arrays;


public class Quiz6 {

	public static void main(String[] args) {

		String[] answer = new String[args.length*4];
		
		for (int i = 0; i < answer.length; i+=args.length) {
			
			System.arraycopy(args, 0, answer, i, args.length);
			
		}
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
		
		
		
		
	}

}
