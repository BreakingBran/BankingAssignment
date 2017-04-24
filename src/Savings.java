public class Savings extends Account {

	static double intrestRate;
	static double transactionFee = 2;

	public Savings(double totalMoney) {
		super(totalMoney);
		/*
		 * this.intrestRate = intrestRate; this.transactionFee = transactionFee;
		 */
	}

	public void deductTransaction() {
		if (this.numOfTransaction > 5) {
			this.totalMoney -= transactionFee;
		}
	}

	static public void printIntrest() {
		System.out.println(intrestRate);
	}
	
	static public void setIntrestSavings(int newIntrest)
	{
		intrestRate = newIntrest;
	}
}
