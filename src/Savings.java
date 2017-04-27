public class Savings extends Account {

  static double intrestRate;
  static double transactionFee = 2;

  public Savings(int accountNumber) {
    super(accountNumber);
    /*
     * this.intrestRate = intrestRate; this.transactionFee = transactionFee;
     */
  }

  public Savings(double totalMoney, int accountNumber) {
    super(totalMoney, accountNumber);
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

  static public void setIntrestSavings(int newIntrest) {
    intrestRate = newIntrest;
  }
}
