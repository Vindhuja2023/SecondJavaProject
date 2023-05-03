package compositionPractise;

public class Dealership {

	public String dealershipName;

	private Cars[] cars = new Cars[5];

//	public void addCarToDealership(Cars car ) {
	// for(int i=0;i<cars.length;i++) {
	// if(cars[i]==null) {
	// cars[i]=car;
	// break;
	// }
	// }
//	}
	public void addCarToDealership(Cars car1, Cars car2, Cars car3, Cars car4) {

		Cars[] carBroughtToDealership = { car1, car2, car3, car4 };

		for (int i = 0; i < carBroughtToDealership.length; i++) {

			cars[i] = carBroughtToDealership[i];
			System.out.println(cars[i].getBrandName());
		}

	}
}
