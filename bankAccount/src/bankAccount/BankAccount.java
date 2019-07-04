package bankAccount;
import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingBalance;
	public static int totalCount;
	public static double totalAmount;
	
	private String randomNum() {
		Random num = new Random();
		String account = "";
		
		for(int i = 0; i<10; i++) {
			int randNum = num.nextInt(10);
			account += randNum;
		}
		return account;
	}
	
	private void allAccount() {
		this.accountNumber = randomNum();
		totalCount++;
	}
	
	private double checkingBalance() {
		return this.checkingBalance;
	}
	
	private double savingsBalance() {
		return this.savingBalance;
	}
	
	public void getBalances() {
		String checkingBalance = String.format("Checking account: $%.2f", checkingBalance());
		System.out.println(checkingBalance);
		String savingBalance = String.format("Savings account: $%.2f", savingsBalance());
		System.out.println(savingBalance);
	}
	public void deposit(String accountType, double money) {
		if(accountType == "Checkings") {
			this.checkingBalance = money;
		}else if(accountType == "Savings") {
			this.savingBalance = money;
		}else {
			System.out.println("Please choose Checkings or Savings.");
		}
	}
	
	public void withdraw(String accountType, double amount) {
		if(accountType == "Checkings") {
			if(amount > this.checkingBalance) {
				System.out.println("Insuffient funds.");
			}
			this.checkingBalance -= amount;
		} else if(accountType == "Savings") {
			if(amount > this.savingBalance) {
				System.out.println("Insuffient funds.");
			}
			this.savingBalance -= amount;
		} else {
			System.out.println("Please choose Checkings or Savings.");
		}
		totalAmount -= amount;
	}
	
}
