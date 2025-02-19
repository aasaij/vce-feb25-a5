package day2;

public class CustomExceptionDemoApp {

	public static void main(String[] args) {
		BankAccount customer1 = new BankAccount(101, "Rishi", 200000);
		try {
//			customer1.deposit(500);
//			System.out.println("Deposited..");
			customer1.withdraw(150000);
			System.out.println("Withdrew...");
			System.out.println("Current Balance : " + customer1.getBalance());
		} 
		catch(InvalidTransactionException ex) {
			System.out.println(ex.getErrorMessage());
		}
		catch(InsufficientFundException ex) {
			System.out.println(ex.getErrorMessage());
		}
	}
}
