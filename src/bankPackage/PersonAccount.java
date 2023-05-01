package bankPackage;

public class PersonAccount {

	private String bankAccountNumber;
	private String nameOfAccountHolder;
	private double totalFundsAvailable;
	private int pinATM;
	private String onlineBankingPassword;

	public PersonAccount(String bankAccountNumber, String nameOfAccountHolder, double totalFundsAvailable, int pinATM,
			String onlineBankingPassword) {
		this.bankAccountNumber = bankAccountNumber;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.totalFundsAvailable = totalFundsAvailable;
		this.pinATM = pinATM;
		this.onlineBankingPassword = onlineBankingPassword;
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
		return pinATM;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

}
