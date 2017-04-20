public class Account {

	protected int totalMoney;
	public int intrestRate;
	protected int numOfTransaction;
	public int transactionFee;
	public int serviceFee;

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
		this.totalMoney -= transactionFee;
	}

	public void deductServiceCharge() {
		this.totalMoney -= serviceFee;
	}

}
