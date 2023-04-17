package scoreCRS;

import java.util.*;

public class CRSScore {
	Scanner sc = new Scanner(System.in);
	int pointsScored;

	void education(String[] educationLevel, int[] point) {
		System.out.println("Enter your Education Level:");
		String level = sc.next();
		for (int i = 0; i < educationLevel.length; i++) {
			if (level.equals(educationLevel[i])) {
				pointsScored = point[i];
			}
		} // System.out.println(pointsScored);

	}

	void experience(double experience) {
		if (experience >= 4 && experience <= 5) {
			pointsScored += 13;
		} else if (experience >= 6) {
			pointsScored += 15;
		} else {
			System.out.println("No point is available in experience catogery ");
		} // System.out.println(pointsScored);
	}

	void age(int[] age, int[] point) {
		System.out.println("Enter your age in years:");
		int ageOfPerson = sc.nextInt();
		if (ageOfPerson >= 18 && ageOfPerson <= 35) {
			pointsScored += 12;
		} else if (ageOfPerson >= 36 && ageOfPerson <= 47) {
			for (int i = 0; i < age.length; i++) {
				if (ageOfPerson == age[i]) {
					pointsScored += point[i];
				}
			}
		} else {
			System.out.println("No point is available in age catogery");
		}
		// System.out.println(pointsScored);
	}

	void scoreIELTS(double listeningScore, double speakingScore, double readingScore, double writingScore) {

		if (listeningScore >= 8) {
			pointsScored += 6;
		} else if (listeningScore == 7.5) {
			pointsScored += 5;
		} else {
			System.out.println("No point is available in IELTS listening catogery");
		}
		if (speakingScore >= 7) {
			pointsScored += 5;
		} else if (speakingScore == 6.5) {
			pointsScored += 5;
		} else {
			System.out.println("No point is available in IELTS speaking catogery");
		}
		if (readingScore >= 7) {
			pointsScored += 5;
		} else if (readingScore == 6.5) {
			pointsScored += 5;
		} else {
			System.out.println("No point is available in IELTS reading catogery");
		}
		if (writingScore >= 7) {
			pointsScored += 5;
		} else if (writingScore == 6.5) {
			pointsScored += 5;
		} else {
			System.out.println("No point is available in IELTS writing catogery");
		} // System.out.println(pointsScored);
	}

	void adaptability(String relativePRCanada, String studyCanada, String workCanada) {
		if (relativePRCanada.equals("Y")) {
			pointsScored += 5;
		}
		if (studyCanada.equals("Y")) {
			pointsScored += 5;
		}
		if (workCanada.equals("Y")) {
			pointsScored += 10;
		} // System.out.println(pointsScored);
	}

	void finalDecisionScore() {
		System.out.println("Total Points you have scored: " + pointsScored + " Points");
		if (pointsScored >= 67) {
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		} else {
			System.out.println("Your score is not enough to submit EOI to Immigration Canada");
		}
	}

}
