package fundamentals.paymentsandtransactions;

public class Account {
	
	private int id;
	private static Transaction[] transactions;
	private int transactionIndex = 0;
	
	public Account(int id) {
		super();
		this.id = id;
	}

	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
	    Transaction tr = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
	    accountTo.receiveMoney(accountTo, moneyAmount);
	    addTransaction(tr);
	}
	
	//TODO error in transaction adding. 
	private void addTransaction(Transaction tr) {
		transactions[transactionIndex] = tr;
		transactionIndex++;
		
	}

	public void receiveMoney(Account account, double moneyAmount) {
		Transaction tr = new Transaction(this, account, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
	    addTransaction(tr);
		
	}

	public void withdrawMoney(double moneyAmount) {
		Transaction tr = new Transaction(this, moneyAmount, StandardAccountOperations.WITHDRAW);
	    addTransaction(tr);
	}
	
	public Transaction[] getTransactions() {
		return transactions;
	}
	
	public static class Transaction {
        private Account accountFrom;
		private Account accountTo;
        private double moneyAmount;
        private StandardAccountOperations operation;
        
        public Transaction(Account accountFrom, Account accountTo, double moneyAmount,
				StandardAccountOperations operation) {
			super();
			this.accountFrom = accountFrom;
			this.accountTo = accountTo;
			this.moneyAmount = moneyAmount;
			this.operation = operation;
		}


		public Transaction(Account accountFrom, double moneyAmount, StandardAccountOperations operation) {
			super();
			this.accountFrom = accountFrom;
			this.moneyAmount = moneyAmount;
			this.operation = operation;
		}

		@Override
		public String toString() {
			return "Transaction [accountFrom=" + accountFrom + ", accountTo=" + accountTo + ", moneyAmount="
					+ moneyAmount + ", operation=" + operation + "]";
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
