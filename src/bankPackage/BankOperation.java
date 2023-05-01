package bankPackage;

import java.util.Scanner;

public class BankOperation {
	Scanner sc = new Scanner(System.in);
	PersonAccount person = new PersonAccount("20102020", "VINDHUJA", 10000.35, 1234, "Bank@1234");
	public int chance;
	public boolean isvalidationSucess;
	public double balanceAvailable = person.getTotalFundsAvailable();

	public boolean validatePersonAccount() {
		return isvalidationSucess;
	}

	public double withdrawMoney() {
		return balanceAvailable;
	}

	public double depositMoney() {
		return balanceAvailable;
	}

	public void viewBalance(double balance) {

	}
}
