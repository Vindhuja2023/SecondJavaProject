package mobilePhone;

import java.util.*;

public class MobilePhoneWithPlan {

	Scanner mob = new Scanner(System.in);
	double price;
	String modelSelect;
	int priceModelSelect;
	String planSelect;
	int pricePlanSelect;
	boolean valueReturnToCheckAvailability;

	String operatingSystemPreffered(String operatingSystem) {

		if (operatingSystem.equals("Apple")) {
			System.out.println("You have selected Apple phone with IOS.");
		} else if (operatingSystem.equals("Samsung")) {
			System.out.println("You have selected Samsung phone with Android.");
		} else {
			System.out.println("The option you have selected is not available");
		}
		return operatingSystem;
	}

	boolean samsungPhoneModels(String[] modelsSamsung, int[] tabAmountSamsung) {
		System.out.println("Please enter the model that you want to buy from below ");
		for (int i = 0; i < modelsSamsung.length; i++) {

			System.out.println(modelsSamsung[i] + "  $" + tabAmountSamsung[i]);
		}
		modelSelect = mob.nextLine();
		for (int i = 0; i < modelsSamsung.length; i++) {
			if (modelSelect.equals(modelsSamsung[i])) {
				priceModelSelect = tabAmountSamsung[i];
				price += tabAmountSamsung[i];
				valueReturnToCheckAvailability = true;
			}
		}
		if (valueReturnToCheckAvailability == true) {
			System.out.println("The product you have selected is available");
		} else {
			System.out.println("The product you have selected is not available.");
			valueReturnToCheckAvailability = false;

		}
		return valueReturnToCheckAvailability;
	}

	boolean applePhoneModels(String[] modelsApple, int[] tabAmountApple) {
		System.out.println("Please enter the model that you want to buy from below ");
		for (int i = 0; i < modelsApple.length; i++) {
			System.out.println(modelsApple[i] + "  $" + tabAmountApple[i]);
		}

		modelSelect = mob.nextLine();

		for (int i = 0; i < modelsApple.length; i++) {
			if (modelSelect.equals(modelsApple[i])) {
				priceModelSelect = tabAmountApple[i];
				price += tabAmountApple[i];
				valueReturnToCheckAvailability = true;
			}
		}
		if (valueReturnToCheckAvailability == true) {
			System.out.println("The product you have selected is available");
		} else {
			System.out.println("The product you have selected is not available.");
			valueReturnToCheckAvailability = false;

		}

		return valueReturnToCheckAvailability;
	}

	boolean selectPlan(String[] connectionProvider, int[] planAmount) {
		System.out.println("Please select the plan that you want to opt for:");
		for (int i = 0; i < connectionProvider.length; i++) {
			System.out.println(connectionProvider[i] + "  $" + planAmount[i]);
		}
		planSelect = mob.next();
		boolean planValue=false;
		for (int i = 0; i < connectionProvider.length; i++) {
			if (planSelect.equals(connectionProvider[i])) {
				pricePlanSelect = planAmount[i];
				price += planAmount[i];
				planValue=true;
			}else {
				planValue=false;
			}
			}if(planValue==true) {
				System.out.println("The plan you have selected is available.");
			}
			else {
				System.out.println("The plan you have selected is not available.");
				
			}
		return planValue;
	}

	void finalBillAmount() {
		System.out.println("You have Selected " + modelSelect + " with " + planSelect + " Plan.");
		System.out.println("Your Phone Tab will be : $" + priceModelSelect);
		System.out.println("Your Monthly Plan will be : $" + pricePlanSelect);
		System.out.println("Total Monthly Amount : $" + price);

	}
}
