package scoreCRS;

import java.util.*;

public class MainCRSScore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CRSScore crs = new CRSScore();
		String[] educationLevel = { "PhD", "Maters", "Two or more university degrees/diplomas in Bachelors", "12th+3 year Degree/Diploma" };
		int[] point = { 25, 23, 22, 21 };
		crs.education(educationLevel, point);
		System.out.println("Enter your Experience in years:");
		double experience = sc.nextDouble();
		crs.experience(experience);
		int[] age = { 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47 };
		int[] pointBasedOnAge = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 00 };
		crs.age(age, pointBasedOnAge);
		System.out.println("Enter your IELTS Score for Listening:");
		double listeningScore = sc.nextDouble();
		System.out.println("Enter your IELTS Score for Speaking:");
		double speakingScore = sc.nextDouble();
		System.out.println("Enter your IELTS Score for Reading: ");
		double readingScore = sc.nextDouble();
		System.out.println("Enter your IELTS Score for Writing:");
		double writingScore = sc.nextDouble();
		crs.scoreIELTS(listeningScore, speakingScore, readingScore, writingScore);
		System.out.println("If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N)");
		String relativePRCanada = sc.next();
		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		String studyCanada = sc.next();
		System.out.println("Have you worked in Canada for atleast 2 years at NOC O Category(Y/N)");
		String workCanadaCatogeryO = sc.next();
		System.out.println("Have you worked in Canada for atleast 2 years at NOC A Category (Y/N)");
		String workCanadaCatogeryA = sc.next();
		System.out.println("Have you worked in Canada for atleast 2 years at NOC B Category(Y/N)");
		String workCanadaCatogeryB = sc.next();
		crs.adaptability(relativePRCanada, studyCanada,workCanadaCatogeryO,workCanadaCatogeryA,workCanadaCatogeryB);
		crs.finalDecisionScore();
		sc.close();

	}

}
