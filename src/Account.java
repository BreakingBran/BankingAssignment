public class Account {

	private int totalMoney;
	public int intrestRate;
	private int numOfTransaction;
	public int transactionFee;

	public Account(int totalMoney) {
		this.totalMoney = totalMoney;
		this.numOfTransaction = 0;
		// TODO Auto-generated constructor stub
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	public int getNumOfTransaction() {
		return numOfTransaction;
	}

	public void setNumOfTransaction(int numOfTransaction) {
		this.numOfTransaction = numOfTransaction;
	}

	public void payIntrest() {

	}

	public void deductTransaction() {

	}

	public void deductServiceCharge() {

	}

}
