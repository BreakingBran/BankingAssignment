
public class SeniorChild extends Account {

	static double intrestRate;

	public SeniorChild(double totalMoney) {
		super(totalMoney);
		/*this.intrestRate = intrestRate;
		this.transactionFee = transactionFee;*/
	}
	
	static public void printIntrest()
	{
		System.out.println(intrestRate);
	}
}
