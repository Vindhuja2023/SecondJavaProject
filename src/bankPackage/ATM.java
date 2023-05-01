package bankPackage;

public class ATM extends BankOperation {
	private int enteredPIN;
	private int withdrawAmount;
	private int depositAmount;

	@Override
	public boolean validatePersonAccount() {
		for (chance = 1; chance <= 3; chance++) {
			System.out.println("Enter ATM Pin : ");
			enteredPIN = sc.nextInt();
			if (enteredPIN == person.getPinATM()) {
				System.out.println("Welcome to ATM services," + person.getNameOfAccountHolder());
				isvalidationSucess = true;
				break;
			} else {
				System.out.println("Incorrect PIN.Try again. ");
				isvalidationSucess = false;
			}
		}
		if (chance > 3) {
			System.out.println("Account locked.");

		}
		return isvalidationSucess;
	}

	@Override
	public double withdrawMoney() {

		System.out.println("Enter the amount to withdraw :");
		withdrawAmount = sc.nextInt();
		if (withdrawAmount < person.getTotalFundsAvailable()) {
			System.out.println("You are withdrwaing " + withdrawAmount);
			balanceAvailable = person.getTotalFundsAvailable() - withdrawAmount;

		} else {
			System.out.println("Insufficient balance,try again");
			balanceAvailable = person.getTotalFundsAvailable();
		}
		return balanceAvailable;
	}

	@Override
	public double depositMoney() {
		System.out.println("Enter the depositing amount :");
		depositAmount = sc.nextInt();
		balanceAvailable = person.getTotalFundsAvailable() + depositAmount;
		System.out.println("Your account have been credited with " + depositAmount);
		return balanceAvailable;

	}

	@Override
	public void viewBalance(double balance) {

		System.out.println("Your current balance is " + balanceAvailable);

	}
}
