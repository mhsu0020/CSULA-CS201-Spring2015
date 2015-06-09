import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class BattleShipRunner {
	public static void takeComputerTurn(char[][] computerCurrentMap,
			int[][] playerBoard) {
		int row = 0;
		int col = 0;

		Random rand = new Random();
		while (computerCurrentMap[row][col] != '?') {
			// Generate between 0 and computerCurrentMap.length-1
			row = rand.nextInt(computerCurrentMap.length);
			col = rand.nextInt(computerCurrentMap.length);

		}
		System.out.println("computer guesses: "+row+" , "+col);
		BattleShipRunner.checkIfSinkShip(playerBoard, row, col,
				computerCurrentMap);

	}

	public static boolean isGameWon(char[][] map, int[][] playerBoard) {
		int shipCount = 0;
		int sinkCount = 0;

		for (int i = 0; i < playerBoard.length; i++) {
			for (int j = 0; j < playerBoard[i].length; j++) {

				if (playerBoard[i][j] == 1) {
					shipCount++;
				}

			}
		}

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {

				if (map[i][j] == 'x') {
					sinkCount++;
				}

			}
		}
		if (sinkCount == shipCount) {
			return true;
		}
		return false;

	}

	public static void printOutMap(char[][] map) {
		for (int i = 0; i < map.length; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
	}

	public static void checkIfSinkShip(int[][] boardToCheck, int row, int col,
			char[][] currentMapDisplay) {
		int shipSpot = boardToCheck[row][col];
		switch (shipSpot) {
		case 0:
			// No ship there
			currentMapDisplay[row][col] = 'm';
			break;

		case 1:
			currentMapDisplay[row][col] = 'x';
			break;
		}

	}

	public static void main(String[] args) {

		/*
		 * 0: vacant spots 1: spots with ships
		 */
		int[][] playerBoard = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 0, 0 } };
		int[][] computerBoard = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		/*
		 * Board for computer:
		 * 
		 * sinked: x missed: m unguessed: ?
		 */
		char[][] currentComputerBoard = { { '?', '?', '?' }, { '?', '?', '?' },
				{ '?', '?', '?' } };

		/*
		 * ?: unguessed spots m: missed vacant spots x: sink spots
		 */
		Scanner scanner = new Scanner(System.in);
		char[][] currentBoardforPlayer = { { '?', '?', '?' },
				{ '?', '?', '?' }, { '?', '?', '?' } };
		while (true) {
			// Player turn:
			BattleShipRunner.printOutMap(currentBoardforPlayer);
			System.out.println("Guess a spot: ");
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			BattleShipRunner.checkIfSinkShip(computerBoard, row, col,
					currentBoardforPlayer);
			if (BattleShipRunner
					.isGameWon(currentBoardforPlayer, computerBoard)) {
				System.out.println("you win!! Are you happy now?");
				break;
			}
			// Computer turns
			System.out.println("Computer's turn: ");
			BattleShipRunner
					.takeComputerTurn(currentComputerBoard, playerBoard);
			System.out.println("Comptuer's map: ");
			BattleShipRunner.printOutMap(currentComputerBoard);

			if (BattleShipRunner.isGameWon(currentComputerBoard, playerBoard)) {
				System.out.println("computer win!! Tough luck.,");
				break;
			}
			System.out.println("----------------------------------");
		}

	}

}
