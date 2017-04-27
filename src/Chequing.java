
public class Chequing extends Account {

	static double intrestRate;
	static double transactionFee = 1.50;

	public Chequing(int accountNumber) {
	    super(accountNumber);
	    /*
	     * this.intrestRate = intrestRate; this.transactionFee = transactionFee;
	     */
	  }

	  public Chequing (double totalMoney,int accountNumber) {
	    super(totalMoney,accountNumber);
	    /*
	     * this.intrestRate = intrestRate; this.transactionFee = transactionFee;
	     */
	  }
	
	public void deductTransaction() {
		if (this.totalMoney < 1000) {
			this.totalMoney -= transactionFee;
		}
	}
}
