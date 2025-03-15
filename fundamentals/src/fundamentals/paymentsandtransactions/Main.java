package fundamentals.paymentsandtransactions;

import fundamentals.paymentsandtransactions.Account.Transaction;

public class Main {
	
	public static void main(String[] args) {
		Account acc = new Account(123);
		Account acc2 = new Account (1234);
		acc.sendMoneyToAccount(acc2, 123);
		acc.withdrawMoney(345);
		
		Transaction[] transactions = acc.getTransactions();
		for (int i = 0; i < transactions.length; i++) {
			System.out.println(transactions[i].toString());
		}
		
		transactions = acc2.getTransactions();
		for (int i = 0; i < transactions.length; i++) {
			System.out.println(transactions[i].toString());
		}
	}

}
