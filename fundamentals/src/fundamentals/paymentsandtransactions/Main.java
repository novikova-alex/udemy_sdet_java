package fundamentals.paymentsandtransactions;

public class Main {
	
	public static void main(String[] args) {
		Account acc = new Account(123);
		Account acc2 = new Account (1234);
		acc.sendMoneyToAccount(acc2, 123);
		acc.withdrawMoney(345);
		
		System.out.println(acc.getTransactions());
	}

}
