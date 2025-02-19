package day2;

public class BankAccount {
	private static int MINIMUM_BALANCE = 500;
	private int accNo;
	private String accName;
	private double balance;
	
	public BankAccount(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAccNo() {
		return accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(int amount) throws InvalidTransactionException {
		if (amount % 100 == 0) {
			this.balance += amount; 
		}
		else
			throw new InvalidTransactionException(101, "Amount should be multiples of 100");
	}
	public void withdraw(int amount) throws InvalidTransactionException, InsufficientFundException {
		if (amount % 100 == 0) {
			if (amount + MINIMUM_BALANCE <= this.balance) {
				this.balance -= amount;
			}
			else
				throw new InsufficientFundException(102, "Insufficient Fund!");
		}
		else
			throw new InvalidTransactionException(101, "Amount should be multiples of 100");
	}
}
