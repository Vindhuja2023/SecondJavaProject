package compositionPractise;

public class MainDealership {

	public static void main(String[] args) {

		Dealership ds = new Dealership();

		Cars hondaCivic = new Cars("Honda", "White", 5, 30000);
		Cars kia = new Cars("Kia", "Blue", 5, 20000);
		Cars nissan = new Cars("Nissan","Red",5,22000);
		Cars chevrolet = new Cars("Chevrolet","White",5,24000);
		//Cars hyundai = new Cars("Hyundai","Black",5,23000);
		
		
		// ds.addCarToDealership(hondaCivic);
		// ds.addCarToDealership(kia);

		ds.addCarToDealership(hondaCivic, kia,nissan,chevrolet);

	}

}
