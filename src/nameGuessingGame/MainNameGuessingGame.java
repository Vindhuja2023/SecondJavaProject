package nameGuessingGame;

public class MainNameGuessingGame {

	public static void main(String[] args) {

		//
		StudentNameGuessingGame game = new StudentNameGuessingGame();
		String randomStudent = game.getRandomStudentName();
		System.out.println( randomStudent);
		char[] lettersInName = game.getCharacterArrayForRandomStudentSelected(randomStudent);
		System.out.println("You are guessing : ");
		System.out.println(lettersInName);
		game.guessNameLetter(10,randomStudent, lettersInName);

	}

}
