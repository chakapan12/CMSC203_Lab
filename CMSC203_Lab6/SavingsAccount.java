
public class SavingsAccount extends BankAccount {

	private double rate = 0.025;
	private static int savingNumber = 0;
	private String accountNumber;

	/**
	 * standard constructor
	 * 
	 * @param name   the owner of the account
	 * @param amount the beginning balance
	 */
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingNumber;
		savingNumber++;
	}

	/**
	 * copy constructor
	 * 
	 * @param oldAccount the account with information to copy
	 * @param amount     the beginning balance of the new account
	 */
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		accountNumber = super.getAccountNumber() + "-" + savingNumber;
		savingNumber++;
	}

	/**
	 * applies monthly interest to the account balance
	 * 
	 * The formula used is balance = balance + (rate * balance) / 12
	 */
	public void postInterest() {
		setBalance(getBalance() + (rate * getBalance() / 12));
	}

	/**
	 * accessor method to account number
	 * 
	 * @return the account number
	 */
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

}
