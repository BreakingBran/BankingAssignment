
public class SeniorChild extends Account {

	static int intrestRate;

	public SeniorChild(int totalMoney) {
		super(totalMoney);
		/*this.intrestRate = intrestRate;
		this.transactionFee = transactionFee;*/
	}
	
	static public void printIntrest()
	{
		System.out.println(intrestRate);
	}
}
