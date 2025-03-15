package fundamentals.paymentsandtransactions;

import java.util.Arrays;

public class Account {
	
	final int DEFAULT_TRANSACTIONS_NUMBER = 10;
	
	private int id;
	private static Transaction[] transactions;
	private static int transactionIndex = 0;

	{
		transactions = new Transaction[DEFAULT_TRANSACTIONS_NUMBER];
	}
	
	public Account(int id) {
		super();
		this.id = id;
	}

	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
	    Transaction transaction = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
	    addTransaction(transaction);
	    accountTo.receiveMoney(this, moneyAmount);
	}
	
	private void addTransaction(Transaction transaction) {
		transactions[transactionIndex] = transaction;
		transactionIndex++;
		
	}

	public void receiveMoney(Account account, double moneyAmount) {
		Transaction transaction = new Transaction(this, account, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
	    addTransaction(transaction);
		
	}

	public void withdrawMoney(double moneyAmount) {
		Transaction transaction = new Transaction(this, moneyAmount, StandardAccountOperations.WITHDRAW);
	    addTransaction(transaction);
	}
	
	public Transaction[] getTransactions() {
	    Transaction[] tempTransactions = new Transaction[transactionIndex]; 
	    int j = 0;
	    
	    for (int i = 0; i < transactionIndex; i++) {
	        if (transactions[i].getAccountFrom().equals(this)) {
	            tempTransactions[j++] = transactions[i];
	        }    
	    }

	    return Arrays.copyOf(tempTransactions, j);
	}
	
	public static class Transaction {
        private Account accountFrom;
		private Account accountTo;
        private double moneyAmount;
        private StandardAccountOperations operation;
        
        public Transaction(Account accountFrom, Account accountTo, double moneyAmount,
				StandardAccountOperations operation) {
			this (accountFrom, moneyAmount, operation);
			this.accountTo = accountTo;
		}


		public Transaction(Account accountFrom, double moneyAmount, StandardAccountOperations operation) {
			this.accountFrom = accountFrom;
			this.moneyAmount = moneyAmount;
			this.operation = operation;
		}

		@Override
		public String toString() {
			 return String.format("Transaction{from=%d, to=%d, amount=%.2f, operation=%s}",
			            accountFrom != null ? accountFrom.id : -1,
			            accountTo != null ? accountTo.id : -1,
			            moneyAmount, operation);
		}


		public Account getAccountFrom() {
			return accountFrom;
		}

		public void setAccountFrom(Account accountFrom) {
			this.accountFrom = accountFrom;
		}

		public Account getAccountTo() {
			return accountTo;
		}

		public void setAccountTo(Account accountTo) {
			this.accountTo = accountTo;
		}

		public double getMoneyAmount() {
			return moneyAmount;
		}

		public void setMoneyAmount(double moneyAmount) {
			this.moneyAmount = moneyAmount;
		}

		public StandardAccountOperations getOperation() {
			return operation;
		}

		public void setOperation(StandardAccountOperations operation) {
			this.operation = operation;
		}
        
        
	}
}
