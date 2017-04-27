import java.util.Scanner;

public class Account {

  protected double totalMoney;
  // static public int intrestRate = 0;
  protected int numOfTransaction = 0;
  public double serviceFee;
  protected int accountNumber;
  static Scanner sc = new Scanner(System.in);

  // Overloading
  public Account(int accountNumber) {
    this.totalMoney = 0;
    this.accountNumber = accountNumber;
    // this.numOfTransaction = 0;
    // TODO Auto-generated constructor stub
  }

  public Account(double totalMoney, int accountNumber) {
    this.totalMoney = totalMoney;
    this.accountNumber = accountNumber;
    // this.numOfTransaction = 0;
    // TODO Auto-generated constructor stub
  }

  public void withdraw(double withdrawAmount) {
    this.totalMoney -= withdrawAmount;
    Bank.totalMoneyInvested -= withdrawAmount;
  }

  public void withdraw()
    {
	  System.out.println("How much do you want to withdraw: ");
	  double withdrawAmount = sc.nextDouble();
      this.totalMoney -=  withdrawAmount;
      Bank.totalMoneyInvested -= withdrawAmount;
    }

  public void deposit(double despositAmount) {
    this.totalMoney += despositAmount;
    Bank.totalMoneyInvested += despositAmount;
  }

  public void deposit()
  {
    System.out.println("How much do you want to deposit: ");
    double despositAmount = sc.nextDouble();
    this.totalMoney -=  despositAmount;
    Bank.totalMoneyInvested -= despositAmount;
  }
  
  public double getTotalMoney() {
    return totalMoney;
  }

  public void setTotalMoney(int totalMoney) {
    this.totalMoney = totalMoney;
    // this.numOfTransaction = 0;
  }

  public int getNumOfTransaction() {
    return numOfTransaction;
  }

  public void setNumOfTransaction(int numOfTransaction) {
    this.numOfTransaction = numOfTransaction;
  }

  public void payIntrest() {

  }

  public void deductTransaction() {
    this.totalMoney -= 0;
  }

  public void deductServiceCharge() {
    this.totalMoney -= serviceFee;
  }

  public void resetTransaction() {
    this.numOfTransaction = 0;
  }

  /*
   * static public void printIntrest() { System.out.println(intrestRate); }
   */
}
