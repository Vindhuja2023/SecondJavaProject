package demoString;

import java.util.*;

public class MainCitiesInOntarioCanada {

	public static void main(String[] args) {
		CitiesInOntarioCanada cityInOntario = new CitiesInOntarioCanada();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a city to search in cities of Ontario :");
		String cityToSearch = sc.next();
		String cityFound = cityInOntario.searchCity(cityToSearch);
		if (cityFound.equals(cityToSearch)) {
			System.out.println("The  city name found as " + cityFound);
		} else {
			System.out.println("The given city not found on the list.");
		}

		int count = cityInOntario.findCitiesEndingWithTon();
		System.out.println("There are " + count + " city name ends with 'ton'");

		cityInOntario.replacingTonWithFunInCityNames();
		System.out.println("The city names after replacing ton with fun are : ");
		System.out.println(Arrays.toString(cityInOntario.citiesInOntario));
		sc.close();

	}

}
