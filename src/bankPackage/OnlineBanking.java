package bankPackage;

public class OnlineBanking extends BankOperation {

	private String accountNumber;
	private String password;
	private int withdrawAmount;
	private int depositAmount;

	@Override
	public boolean validatePersonAccount() {
		for (chance = 1; chance <= 3; chance++) {
			System.out.println("Enter Account number : ");
			accountNumber = sc.next();
			System.out.println("Enter Password : ");
			password = sc.next();
			if (accountNumber.equals(person.getBankAccountNumber())
					&& password.equals(person.getOnlineBankingPassword())) {
				System.out.println(
						"Hi " + person.getNameOfAccountHolder() + ", You are logged into the online banking. ");
				isvalidationSucess = true;
				break;
			} else {
				System.out.println("Incorrect account number or password.Try again. ");
				isvalidationSucess = false;
			}
		}
		if (chance > 3) {
			System.out.println("Account locked since you had 3 wrong attempts.");
		}
		return isvalidationSucess;
	}

	@Override
	public double withdrawMoney() {
		System.out.println("Enter the amount to withdraw :");
		withdrawAmount = sc.nextInt();
		if (withdrawAmount < person.getTotalFundsAvailable()) {
			System.out.println(person.getNameOfAccountHolder() + " withdrwan " + withdrawAmount);
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
		System.out.println("Your current  balance is " + balanceAvailable);

	}
}
