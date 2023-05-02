package bankPackage;

public class PersonAccount {

	private String bankAccountNumber;
	private String nameOfAccountHolder;
	private double totalFundsAvailable;
	private int pinATM;
	private String onlineBankingPassword;
	private boolean isBank;

	public PersonAccount(String bankAccountNumber, String nameOfAccountHolder, double totalFundsAvailable, int pinATM,
			String onlineBankingPassword) {
		this.bankAccountNumber = bankAccountNumber;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.totalFundsAvailable = totalFundsAvailable;
		this.pinATM = pinATM;
		this.onlineBankingPassword = onlineBankingPassword;

	}

	public boolean isBankAcceesing() {
		System.out.println("Confirm it is bank who accessing the personal details of account holder");
		isBank = true;
		return isBank;
	}

	public String getBankAccountNumber() {

		return bankAccountNumber;
	}

	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}

	public double getTotalFundsAvailable() {
		return totalFundsAvailable;
	}

	public int getPinATM() {
		if (isBank) {

			return pinATM;
		}
		return 0;
	}

	public String getOnlineBankingPassword() {
		if (isBank) {

			return onlineBankingPassword;
		}
		return null;
	}

}
