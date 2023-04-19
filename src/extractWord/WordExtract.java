package extractWord;

public class WordExtract {

	String str = "100 queen street,Toronto,M5V 3E3";

	String[] extractWords() {
		String word[] = str.split("[,]");
		return word;
	}

}
