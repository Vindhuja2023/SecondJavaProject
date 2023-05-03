package compositionPractise;

public class Cars {

	private String brandName;
	private String colour;
	private int seatingCapacity;
	private double price;

	public Cars(String brandName, String colour, int seatingCapacity, double price) {
		super();
		this.brandName = brandName;
		this.colour = colour;
		this.seatingCapacity = seatingCapacity;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public String getColour() {
		return colour;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public Cars() {
		super();
	}

}
