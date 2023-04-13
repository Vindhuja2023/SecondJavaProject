package pizzaProgram;

public class PizzaBill {
	
int[] price = {15,20,25};
int[] pepperoniToppingPrice = {2,3,3};
int extraCheesePrice = 1;

void displayingPizzaDetails(String[] pizzaSize) {
	
	for(int i =0;i<3;i++) {
		System.out.println("The price of "+pizzaSize[i] +" Pizza is $"+price[i] + " and for extra pepperoni topping $"+pepperoniToppingPrice[i]);
	}System.out.println("The price of additional cheese for any size is $" +extraCheesePrice);
	
}

void bill(String[] pizzaSize) {
	int finalBillAmount =0;
	for(int i=0;i<3;i++) {
		if(pizzaSize[i].equals("Medium")) {
	 finalBillAmount = price[i]+pepperoniToppingPrice[i]+extraCheesePrice;
		}}System.out.println("Your final bill is $"+finalBillAmount );
}


	

}
