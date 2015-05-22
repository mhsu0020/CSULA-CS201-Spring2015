import java.util.Arrays;

public class FindShortestDistance {

	public static void main(String[] args) {

		/* Create an two dimensional array to store the coordinates */

		double[][] coordinates = { { -1, 3 }, { -1, -1 }, { 1, 1 }, { 2, 0.5 },
				{ 2, -1 }, { 3, 3 }, { 4, 2 }, { 4, -0.5 } };
		double minimumDistance = FindShortestDistance.calculateDistance(
				coordinates[0], coordinates[1]);
		int minimumDistnaceCoordinateOneIndex = 0;
		int minimumDistnaceCoordinateTwoIndex = 1;
		for (int i = 0; i < coordinates.length; i++) {
			// Get the distances between coordinate i and the rest of the points
			for (int j = i + 1; j < coordinates.length; j++) {
				double distance = FindShortestDistance.calculateDistance(
						coordinates[i], coordinates[j]);
				if (distance < minimumDistance) {
					minimumDistance = distance;
					minimumDistnaceCoordinateOneIndex = i;
					minimumDistnaceCoordinateTwoIndex = j;
				}

			}
		}
		System.out.println("Nearest points: ");
		FindShortestDistance.printOutDistanceBetweenArray(
				coordinates[minimumDistnaceCoordinateOneIndex],
				coordinates[minimumDistnaceCoordinateTwoIndex]);

	}

	public static double calculateDistance(double[] pointOne, double[] pointTwo) {
		return Math.sqrt(Math.pow(pointOne[0] - pointTwo[0], 2)
				+ Math.pow(pointOne[1] - pointTwo[1], 2));
	}

	public static void printOutDistanceBetweenArray(double[] pointOne,
			double[] pointTwo) {

		System.out.println("The distance between " + Arrays.toString(pointOne)
				+ " and " + Arrays.toString(pointTwo) + " is: "
				+ calculateDistance(pointOne, pointTwo));

	}

}
