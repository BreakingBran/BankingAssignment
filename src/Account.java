public class Account {

	protected double totalMoney;
	//static public int intrestRate = 0;
	protected int numOfTransaction = 0;
	public double serviceFee;
	protected int accountNumber;

	public Account(double totalMoney) {
		this.totalMoney = totalMoney;
		this.numOfTransaction = 0;
		// TODO Auto-generated constructor stub
	}
	
	//Overloading
	public Account() {
		this.totalMoney = 0;
		//this.numOfTransaction = 0;
		// TODO Auto-generated constructor stub
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
		//this.numOfTransaction = 0;
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
		this.totalMoney -= 0;
	}

	public void deductServiceCharge() {
		this.totalMoney -= serviceFee;
	}
	
	public void resetTransaction()
	{
		this.numOfTransaction = 0;
	}
	
	/*static public void printIntrest()
	{
		System.out.println(intrestRate);
	}	*/
}
