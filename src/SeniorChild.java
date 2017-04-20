
public class SeniorChild extends Account {

	//static int intrestRate;

	public SeniorChild(int intrestRate, int transactionFee, int totalMoney) {
		super(totalMoney);
		this.intrestRate = intrestRate;
		this.transactionFee = transactionFee;
	}
}
