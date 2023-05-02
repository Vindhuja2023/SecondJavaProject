package bankPackage;

import java.util.Scanner;

public class BankOperation {
	Scanner sc = new Scanner(System.in);

	public int chance;
	public boolean isvalidationSucess;
	public double balanceAvailable;
	private String accountNumber;
	private String bankPassword;

	public BankOperation() {

	}

	public BankOperation(String accountNumber, String bankPassword, String nameOfAccountHolder,
			double totalFundsAvailable) {
		super();
		this.accountNumber = accountNumber;
		this.bankPassword = bankPassword;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.totalFundsAvailable = totalFundsAvailable;
	}

	public String nameOfAccountHolder;
	double totalFundsAvailable;

	public boolean validatePersonAccount() {

		for (chance = 1; chance <= 3; chance++) {
			System.out.println("Enter Account number : ");
			String accountNumberEntered = sc.nextLine();
			System.out.println("Enter Password : ");
			String bankPasswordEntered = sc.nextLine();
			if (accountNumberEntered.equals(accountNumber) && bankPasswordEntered.equals(bankPassword)) {
				System.out.println("Hi " + nameOfAccountHolder + ", Welcome to the Bank service ");
				isvalidationSucess = true;
				break;
			} else {
				System.out.println("Incorrect Account number or  Password.Try again. ");
				isvalidationSucess = false;
			}
		}
		if (chance > 3) {
			System.out.println("Account locked since you had 3 wrong attempts.");
		}
		return isvalidationSucess;
	}

	public double withdrawMoney() {
		System.out.println("Do you want to use cheque-cashing service? Y/N");
		String isChequeCasing = sc.next();
		System.out.println("Enter the amount to withdraw :");
		double withdrawAmount = sc.nextDouble();
		if (isChequeCasing.equals("Y")) {
			System.out.println("Submit the cheque at the counter and wait for the money");
		} else {
			System.out.println("How would you like to withdraw money from Bank? 1.By Cash 2.By cheque");
			int withdrawMode = sc.nextInt();
			switch (withdrawMode) {
			case 1:
				System.out.println("Wait for your cash. ");
				System.out.println("You have withdrawn " + withdrawAmount);
				break;
			case 2:
				System.out.println("Do visit the counter with receipt generated ");
				break;
			default:
				System.out.println("Invalid entry.");
			}
		}
		balanceAvailable = totalFundsAvailable - withdrawAmount;

		return balanceAvailable;
	}

	public double depositMoney() {
		System.out.println("Enter the name of person depositing the money :");
		String nameOfDepositer = sc.nextLine();
		System.out.println("Enter the amount to deposit :");
		int depositeAmount = sc.nextInt();
		System.out.println("How would you like to deposit money to the Bank? 1.By Cash 2.By cheque");
		int depositMode = sc.nextInt();
		switch (depositMode) {
		case 1:
			System.out.println(" Put the cash on machine and wait for the updation ");

		case 2:
			System.out.println(
					"Do visit the counter with your cheque completely filled and signed and wait for updation");
		}
		balanceAvailable = totalFundsAvailable + depositeAmount;
		System.out.println(nameOfDepositer + "deposited " + depositeAmount);

		return balanceAvailable;
	}

	public void viewBalance(double balance) {
		System.out.println("Your current balance is " + balance);
	}
}
