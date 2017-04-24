
public class Chequing extends Account {

	static double intrestRate;
	static double transactionFee = 1.50;

	public Chequing( double totalMoney) {
		super(totalMoney);
		/*this.intrestRate = intrestRate;
		this.transactionFee = transactionFee;*/
	}
	
	public void deductTransaction() {
		if (this.totalMoney < 1000) {
			this.totalMoney -= transactionFee;
		}
	}
}
