public class Savings extends Account {

	//static int intrestRate;

	public Savings(int intrestRate, int transactionFee, int totalMoney) {
		super(totalMoney);
		this.intrestRate = intrestRate;
		this.transactionFee = transactionFee;
	}

	public void deductTransaction() {
		this.totalMoney -= transactionFee; 
	}}
