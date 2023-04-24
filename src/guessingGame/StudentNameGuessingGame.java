package guessingGame;

import java.util.Random;
import java.util.Scanner;

public class StudentNameGuessingGame {
	Scanner input = new Scanner(System.in);

	public String getRandomStudentName(String[] nameOfStudents) {
		Random r = new Random();
		int randomStudentIndex = r.nextInt(nameOfStudents.length);
		String randomStudent = nameOfStudents[randomStudentIndex];
		System.out.println(randomStudent);
		return randomStudent;
	}

	public char[] getCharacterArrayForRandomStudentSelected(String randomStudent) {

		char[] lettersInName = new char[randomStudent.length()];
		for (int i = 0; i < randomStudent.length(); i++) {
			lettersInName[i] = '_';
		}
		return lettersInName;
	}

	public void guessNameLetter(String randomStudent, char[] lettersInName) {
		int point = 10;
		int wrongCount = 0;
		System.out.println("You have guessed (" + wrongCount + ") wrong letters");
		while (point > 0 && wrongCount < 5) {

			System.out.println("Guess a letter : ");
			char enterCharacter = input.next().charAt(0);
			if (randomStudent.contains(enterCharacter + "")) {

				for (int i = 0; i < randomStudent.length(); i++) {
					if (enterCharacter == randomStudent.charAt(i)) {
						lettersInName[i] = enterCharacter;
					}
				}
			} else {
				point--;
				wrongCount += 1;

			}
			System.out.println("You have guessed (" + wrongCount + ") wrong letters");
			if (randomStudent.equals(String.valueOf(lettersInName))) {
				System.out.println(lettersInName);
				System.out.println("You won");
				break;
			}
			System.out.println("You are guessing : ");
			System.out.println(lettersInName);
			// System.out.println("Remaining point " + point);
		}
		if (point == 0 || wrongCount >= 5) {
			System.out.println("Game over");
		}
	}
}
