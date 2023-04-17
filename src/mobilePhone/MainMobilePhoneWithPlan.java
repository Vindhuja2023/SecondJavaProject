package mobilePhone;

import java.util.*;

public class MainMobilePhoneWithPlan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MobilePhoneWithPlan phone = new MobilePhoneWithPlan();
		System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung :");
		String os = sc.next();
		String phoneType = phone.operatingSystemPreffered(os);
		String[] modelSamsung = { "S22", "S22+", "S22Ultra", "S22FE" };
		int[] tabAmountSamsung = { 25, 35, 55, 20 };
		String[] modelApple = { "IPhone14", "Iphone14Pro", "IPhone14ProMax", "IPhone14Mini" };
		int[] tabAmountApple = { 30, 40, 65, 25 };

		if (phoneType.equals("Apple")) {

			phone.applePhoneModels(modelApple, tabAmountApple);
		} else if (phoneType.equals("Samsung")) {

			phone.samsungPhoneModels(modelSamsung, tabAmountSamsung);
		}
		String[] connectionProvider = { "Rogers", "Bell", "Telus" };
		int[] planAmount = { 70, 80, 75 };
		phone.selectPlan(connectionProvider, planAmount);
		phone.finalBillAmount();
		sc.close();
	}

}
