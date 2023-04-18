package mobilePhone;

import java.util.*;

public class MainMobilePhoneWithPlan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MobilePhoneWithPlan phone = new MobilePhoneWithPlan();
		System.out.println("Please enter the Brand that you want to choose from: Apple/ Samsung :");
		String os = sc.next();
		String phoneType = phone.operatingSystemPreffered(os);
		String[] modelSamsung = { "S22", "S22 +", "S22 Ultra", "S22 FE" };
		int[] tabAmountSamsung = { 25, 35, 55, 20 };
		String[] modelApple = { "IPhone 14", "Iphone 14 Pro", "IPhone 14 Pro Max", "IPhone 14 Mini" };
		int[] tabAmountApple = { 30, 40, 65, 25 };
		boolean value = false;
		if (phoneType.equals("Apple")) {

			value = phone.applePhoneModels(modelApple, tabAmountApple);
		} else if (phoneType.equals("Samsung")) {

			value = phone.samsungPhoneModels(modelSamsung, tabAmountSamsung);
		}
		if (value) {
			String[] connectionProvider = { "Rogers", "Bell", "Telus" };
			int[] planAmount = { 70, 80, 75 };
			boolean valuePlan = phone.selectPlan(connectionProvider, planAmount);
			if (valuePlan) {
				phone.finalBillAmount();
			}
		}
		sc.close();
	}

}
