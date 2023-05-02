package bankPackage;

public class ATM extends BankOperation {
	private int enteredPIN;
	private int withdrawAmount;
	private int depositAmount;
	private int pinATM;
	private String nameOfAccountHolder;
	private double totalFundsAvailable;

	public ATM(int pinATM, String nameOfAccountHolder, double totalFundsAvailable) {
		super();
		this.pinATM = pinATM;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.totalFundsAvailable = totalFundsAvailable;
	}

	@Override
	public boolean validatePersonAccount() {
		for (chance = 1; chance <= 3; chance++) {
			System.out.println("Enter ATM Pin : ");
			enteredPIN = sc.nextInt();
			if (enteredPIN == pinATM) {
				System.out.println("Welcome to ATM services," + nameOfAccountHolder);
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
		if (withdrawAmount < totalFundsAvailable) {
			System.out.println("You are withdrwaing " + withdrawAmount);
			balanceAvailable = totalFundsAvailable - withdrawAmount;

		} else {
			System.out.println("Insufficient balance,try again");
			balanceAvailable = totalFundsAvailable;
		}
		return balanceAvailable;
	}

	@Override
	public double depositMoney() {
		System.out.println("Enter the depositing amount :");
		depositAmount = sc.nextInt();
		System.out.println("Do you want to deposit via Cheque? Y/N");
		String isCheque = sc.next();
		if (isCheque.equals("Y")) {
			System.out.println("Completely filled and signed Cheque should be submitted and wait for the updation");
		} else {
			System.out.println("The amount will be verified and updated in your account");
		}

		balanceAvailable = totalFundsAvailable + depositAmount;
		System.out.println("Your account have been credited with " + depositAmount);
		return balanceAvailable;

	}

}
