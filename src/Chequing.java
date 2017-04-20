
public class Chequing extends Account {

	//static int intrestRate;

	public Chequing(int intrestRate, int transactionFee, int totalMoney) {
		super(totalMoney);
		this.intrestRate = intrestRate;
		this.transactionFee = transactionFee;
	}
}
