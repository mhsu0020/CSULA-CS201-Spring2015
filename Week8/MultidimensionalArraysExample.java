import java.util.Arrays;


public class MultidimensionalArraysExample {

	public static void main(String[] args) {
    int[][] myArray = {{1, 2, 3}, {4, 5, 6},{7,8,9}};
    //a for loop on the outer row array
    for (int i = 0; i < myArray.length; i++) {
    	System.out.print(Arrays.toString(myArray[i])+" ,");	
	}
    System.out.println();
		
	}

}
