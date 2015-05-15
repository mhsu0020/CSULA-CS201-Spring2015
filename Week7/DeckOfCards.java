import java.util.Random;

public class DeckOfCards {

	public static String getSuiteAndFaceValue(int valueFromDeckArrayElement) {
		int suitNum = valueFromDeckArrayElement / 13;

		int faceValue = valueFromDeckArrayElement % 13 + 1;

		String suite = "";
		switch (suitNum) {
		case 0:
			suite = "spades";
			break;
		case 1:
			suite = "hearts";

			break;
		case 2:
			suite = "diamonds";

			break;
		case 3:
			suite = "clubs";

			break;

		}
		if (faceValue == 1) {
			return "Ace of " + suite;
		} else if (faceValue == 11) {
			return "Jack of " + suite;

		} else if (faceValue == 12) {

			return "Queen of " + suite;

		} else if (faceValue == 13) {

			return "King of " + suite;

		} else {

			return faceValue + " of " + suite;

		}

	}

	public static void shuffleDeck(int[] deckOfCards) {

		// Shuffle the deck
		for (int i = 0; i < deckOfCards.length - 2; i++) {

			int lastPositionOfArray = deckOfCards.length - 1;
			int beginIndexOfShuffle = i + 1;

			Random rand = new Random();

			// nextInt is normally exclusive of the top value,
			// so add 1 to make it inclusive
			// int randomNum = rand.nextInt((max - min) + 1) + min;

			int randomIndex = rand
					.nextInt((lastPositionOfArray - beginIndexOfShuffle) + 1)
					+ beginIndexOfShuffle;

			int randomElement = deckOfCards[randomIndex];

			int temp = deckOfCards[i];
			deckOfCards[i] = randomElement;
			deckOfCards[randomIndex] = temp;

		}

	}

	public static void main(String[] args) {
		int[] deckOfCards = new int[52];

		// filled the deck
		for (int i = 0; i < deckOfCards.length; i++) {
			deckOfCards[i] = i;
		}
		DeckOfCards.shuffleDeck(deckOfCards);

		for (int i = 0; i < deckOfCards.length; i++) {
			System.out
					.println(DeckOfCards.getSuiteAndFaceValue(deckOfCards[i]));
		}

	}

}
