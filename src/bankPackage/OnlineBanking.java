package bankPackage;

public class OnlineBanking extends BankOperation {

	private String password;
	private String onlineBankingPassword;

	private int depositAmount;
	private double totalFundsAvailable;

	public OnlineBanking(String onlineBankingPassword, String nameOfAccountHolder, double totalFundsAvailable) {
		super();
		this.onlineBankingPassword = onlineBankingPassword;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.totalFundsAvailable = totalFundsAvailable;
	}

	@Override
	public boolean validatePersonAccount() {
		for (chance = 1; chance <= 3; chance++) {

			System.out.println("Enter Password : ");
			password = sc.next();
			if (password.equals(onlineBankingPassword)) {
				System.out.println("Hi " + nameOfAccountHolder + ", You are logged into the online banking. ");
				isvalidationSucess = true;
				break;
			} else {
				System.out.println("Incorrect password.Try again. ");
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
		System.out.println("Online banking doesn't allow withdrawel of Money");
		balanceAvailable = totalFundsAvailable;
		return balanceAvailable;
	}

	@Override
	public double depositMoney() {
		System.out.println("Enter the depositing amount :");
		depositAmount = sc.nextInt();
		balanceAvailable = totalFundsAvailable + depositAmount;
		System.out.println("Your account have been credited with " + depositAmount);
		return balanceAvailable;

	}

}
