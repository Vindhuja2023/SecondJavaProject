package pizzaProgramUsingArguments;



public class MainPizzaBill {

	public static void main(String[] args) {
		PizzaBill pizza = new PizzaBill();
		String[] pizzaSize = {"Small","Medium","Large"};
		pizza.displayingPizzaDetails(pizzaSize);
		pizza.bill(pizzaSize);


	}

}
