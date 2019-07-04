package bankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount num = new BankAccount();
		
		num.deposit("Checkings", 300);
		num.deposit("Savings", 1000);
		num.withdraw("Checkings", 100.00);
		num.withdraw("Savings", 400.00);
		num.getBalances();
	}
}
