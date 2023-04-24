package nameGuessingGame;

public class MainNameGuessingGame {

	public static void main(String[] args) {

		String[] nameOfStudents = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
				"Kamaldeep", "Manpreetk", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat",
				"Rojy", "Sojan", "Suchitra", "Vindhuja" };

		StudentNameGuessingGame game = new StudentNameGuessingGame();
		String randomStudent = game.getRandomStudentName(nameOfStudents);
		char[] lettersInName = game.getCharacterArrayForRandomStudentSelected(randomStudent);
		System.out.println("You are guessing : ");
		System.out.println(lettersInName);
		game.guessNameLetter(randomStudent, lettersInName);

	}

}
