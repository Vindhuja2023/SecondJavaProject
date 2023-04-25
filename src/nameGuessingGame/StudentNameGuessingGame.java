package nameGuessingGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;

public class StudentNameGuessingGame {

	Scanner input = new Scanner(System.in);

	public String getRandomStudentName() {
		File fileName = new File("studentname.txt");
		ArrayList<String> allNames = new ArrayList<String>();
		Random random = new Random();
		Scanner input;
		try {
			input = new Scanner(fileName);
			while (input.hasNextLine()) {
				allNames.add(input.nextLine());
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String randomStudent = allNames.get(random.nextInt(allNames.size()));
		return randomStudent;
	}

	public char[] getCharacterArrayForRandomStudentSelected(String randomStudent) {

		char[] lettersInName = new char[randomStudent.length()];
		for (int i = 0; i < randomStudent.length(); i++) {
			lettersInName[i] = '_';
		}
		return lettersInName;
	}

	public void guessNameLetter(int point, String randomStudent, char[] lettersInName) {
		char[] wrongChar = new char[randomStudent.length()];
		int wrongCount = 0;
		
		char startChar = Character.toLowerCase(randomStudent.charAt(0));
		//boolean matchingValue = false;
		while (point > 0 && wrongCount < 5) {

			System.out.println("Guess a letter : ");
			char enterCharacter = input.next().charAt(0);
			
			enterCharacter = Character.toLowerCase(enterCharacter);
			if (randomStudent.contains(enterCharacter+"")||(startChar+"").contains(enterCharacter+"")) {

				if (String.valueOf(lettersInName).contains(enterCharacter + "")) {
					System.out.println("Already taken input character entered.");

				}

				for (int i = 0; i < randomStudent.length(); i++) {

					if ((enterCharacter + "").equalsIgnoreCase(randomStudent.charAt(i) + "")) {
						lettersInName[i] = enterCharacter;
					}
				}
			} else {
				int i=0;
				for ( i = i + wrongCount; i < randomStudent.length();) {
					wrongChar[i] = enterCharacter;
					
					break;
				}
				point--;
				wrongCount += 1;

			}

			if (randomStudent.equalsIgnoreCase(String.valueOf(lettersInName))) {
				System.out.println("You win!");
				System.out.println("You have guessed " + (String.valueOf(lettersInName)) + " correctly");
				break;
			}
			System.out.println("You have guessed (" + wrongCount + ") wrong letters :" + String.valueOf(wrongChar));
			System.out.println("You are guessing : ");
			System.out.println(lettersInName);
			// System.out.println("Remaining point " + point);
		}

		if (point == 0 || wrongCount >= 5) {
			System.out.println("Game over!");
		}
	}
}
