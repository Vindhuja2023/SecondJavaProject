package extractWord;



public class MainWordExtract {

	public static void main(String[] args) {
		WordExtract extract = new WordExtract();
		String extractedArray[] = extract.extractWords();
		String streetAddress = extractedArray[0];
		String city = extractedArray[1];
		String zip = extractedArray[2];
		System.out.println("Street Address ="+streetAddress);
		System.out.println("City = "+city);
		System.out.println("Zip = "+zip);

	}

}
