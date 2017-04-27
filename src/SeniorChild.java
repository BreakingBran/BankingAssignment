public class SeniorChild extends Account {

  static double intrestRate;

  public SeniorChild(int accountNumber) {
    super(accountNumber);
    /*
     * this.intrestRate = intrestRate; this.transactionFee = transactionFee;
     */
  }

  public SeniorChild(double totalMoney,int accountNumber) {
    super(totalMoney,accountNumber);
    /*
     * this.intrestRate = intrestRate; this.transactionFee = transactionFee;
     */
  }

  static public void printIntrest() {
    System.out.println(intrestRate);
  }
}
