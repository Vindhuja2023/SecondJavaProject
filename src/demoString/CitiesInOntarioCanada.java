package demoString;

public class CitiesInOntarioCanada {

	String[] citiesInOntario = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington",
			"Kingston", "Kitchener" };

	String searchCity(String cityName) {
		String cityFound = null;
		int count = 0;
		for (int i = 0; i < citiesInOntario.length; i++) {
			if (citiesInOntario[i].contains(cityName)) {
				cityFound = citiesInOntario[i];
				count += 1;
			}
		}
		if (count == 1) {
			cityFound = cityName;
		} else {
			cityFound = "not found";
		}

		return cityFound;
	}

	int findCitiesEndingWithTon() {
		int count = 0;
		System.out.println("The given city names ending with 'ton' are :");
		for (int i = 0; i < citiesInOntario.length; i++) {
			if (citiesInOntario[i].contains("ton")) {
				System.out.println(citiesInOntario[i]);
				count += 1;
			}
		}
		return count;
	}

	void replacingTonWithFunInCityNames() {
		for (int i = 0; i < citiesInOntario.length; i++) {
			if (citiesInOntario[i].contains("ton")) {
				citiesInOntario[i] = citiesInOntario[i].replace("ton", "fun");
			}
		}
	}
}