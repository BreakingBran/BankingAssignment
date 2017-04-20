public class Savings extends Account {

	//static int intrestRate;

	public Savings(int totalMoney) {
		super(totalMoney);
		/*this.intrestRate = intrestRate;
		this.transactionFee = transactionFee;*/
	}

	public void deductTransaction() {
		this.totalMoney -= transactionFee; 
	}}
