import java.util.Arrays;

public class ParkingExample {

	public static void main(String[] args) {
		char[][] parkingSpots = { { 's', 's' }, { 's', 's' } };

		for (int i = 0; i < parkingSpots.length; i++) {
			System.out.println(Arrays.toString(parkingSpots[i]));
		}
		
		//Update the value of the array element/cell
		parkingSpots[0][0] = 't';
		
		for (int i = 0; i < parkingSpots.length; i++) {
			System.out.println(Arrays.toString(parkingSpots[i]));
		}

	}

}
