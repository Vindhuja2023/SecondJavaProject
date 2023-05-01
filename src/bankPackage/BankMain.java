package bankPackage;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		double balance = 0.0;
		Scanner sc = new Scanner(System.in);

		BankOperation bo = null;

		System.out.println("Choose the mode of banking service preferred :1. ATM 2.Online Banking");
		int bankServiceMode = sc.nextInt();
		boolean isvalidationSucess;
		switch (bankServiceMode) {
		case 1:
			bo = new ATM();
			isvalidationSucess = bo.validatePersonAccount();
			if (isvalidationSucess) {
				int bankOperationATM = 0;
				do {
					System.out.println(
							"Choose the bank operation: 1.Money withdrwal 2.Money deposite 3.View balance 4.Exit");
					bankOperationATM = sc.nextInt();

					switch (bankOperationATM) {
					case 1:
						balance = bo.withdrawMoney();
						bo.viewBalance(balance);
						break;
					case 2:
						balance = bo.depositMoney();
						bo.viewBalance(balance);
						break;
					case 3:
						bo.viewBalance(balance);
						break;
					case 4:
						System.out.println("Thank you for choosing ATM services.");
						break;
					default:
						System.out.println("You have selected invalid bank operation.");
					}
				} while (bankOperationATM < 4);
			}
			break;

		case 2:
			bo = new OnlineBanking();

			isvalidationSucess = bo.validatePersonAccount();
			if (isvalidationSucess) {
				int onlineBankOperation = 0;
				do {
					System.out.println(
							"Choose the bank operation: 1.Money withdrwal 2.Money deposite 3.View balance 4.Exit");
					onlineBankOperation = sc.nextInt();
					switch (onlineBankOperation) {
					case 1:
						balance = bo.withdrawMoney();
						bo.viewBalance(balance);
						break;
					case 2:
						balance = bo.depositMoney();
						bo.viewBalance(balance);
						break;
					case 3:
						bo.viewBalance(balance);
						break;
					case 4:
						System.out.println("Thank you for choosing Online banking services.");
						break;

					default:
						System.out.println("You have selected invalid bank operation. ");
					}
				} while (onlineBankOperation < 4);
			}
			break;

		default:
			System.out.println("Invalid mode of operation");

		}
		sc.close();

	}
}
