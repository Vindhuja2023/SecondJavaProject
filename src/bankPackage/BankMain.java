package bankPackage;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BankOperation bo = null;

		PersonAccount person = new PersonAccount("20102020", "VINDHUJA", 10000.35, 1234, "Bank@1234");
		double balance = person.getTotalFundsAvailable();
		boolean isBank = person.isBankAcceesing();
		if (isBank) {
			System.out.println("Choose the mode of banking service preferred :1.ATM 2.Online Banking 3.In person");
			int bankServiceMode = sc.nextInt();
			boolean isValidationSucess = false;
			switch (bankServiceMode) {
			case 1:
				bo = new ATM(person.getPinATM(), person.getNameOfAccountHolder(), person.getTotalFundsAvailable());
				isValidationSucess = bo.validatePersonAccount();
				break;

			case 2:
				bo = new OnlineBanking(person.getOnlineBankingPassword(), person.getNameOfAccountHolder(),
						person.getTotalFundsAvailable());
				isValidationSucess = bo.validatePersonAccount();
				break;
			case 3:
				bo = new BankOperation(person.getBankAccountNumber(), person.getOnlineBankingPassword(),
						person.getNameOfAccountHolder(), person.getTotalFundsAvailable());
				isValidationSucess = bo.validatePersonAccount();
				break;
			default:
				System.out.println("Invalid mode of operation");

			}
			if (isValidationSucess) {
				int bankOperationATM = 0;

				System.out
						.println("Choose the bank operation: 1.Money withdrwal 2.Money deposite 3.View balance 4.Exit");
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
					System.out.println("Thank you for choosing Banking services.");
					break;
				default:
					System.out.println("You have selected invalid bank operation.");
				}
			}
		}

		sc.close();

	}
}
