import java.util.*;

public class Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Number of people in the bank
		// int numberOfMembers = sc.nextInt();
		// Bank ourBank = new Bank();

		int totalMoneyInvested;

		List<Account> accountMembers = new ArrayList<Account>();

		int checkingCounter = 0;
		List<Account> counterMembersIndexes = new ArrayList<Account>();

		int savingsCounter = 0;
		List<Account> savingsMembersIndexes = new ArrayList<Account>();

		int seniorCounter = 0;
		List<Account> seniorMembersIndexes = new ArrayList<Account>();

		boolean isBankOn = true;
		String prompt;
		int money;

		while (isBankOn) {
			prompt = sc.next();

			if (prompt.equals("new account")) {
				System.out.println("What type of account: ");
				prompt = sc.next();
				if (prompt.toLowerCase() == "savings") {
					System.out.println("Initial Amount: ");
					money = sc.nextInt();
					Savings member = new Savings(money);
					accountMembers.add(member);
					savingsCounter += 1;

				}

				else if (prompt.toLowerCase().equals("chequing")) {
					System.out.println("Initial Amount: ");
					money = sc.nextInt();
					Chequing member = new Chequing(money);
					accountMembers.add(member);
					checkingCounter += 1;
				}

				else if ((prompt.toLowerCase()).equals("senior")
						|| prompt.toLowerCase() == "child") {
					System.out.println("Initial Amount: ");
					money = sc.nextInt();
					SeniorChild member = new SeniorChild(money);
					accountMembers.add(member);
					seniorCounter += 1;

				}
			}

			else if (prompt.equals("setSavingsIntrest")) {

				Savings.printIntrest();
				System.out.println("Whar's the new intrest rate: ");
				money = sc.nextInt();
				setSavingsIntrest(money);
				Savings.printIntrest();

			} else if (prompt.equals("setCheckingIntrest")) {

				Savings.printIntrest();
				System.out.println("Whar's the new intrest rate: ");
				money = sc.nextInt();
				setCheckingIntrest(money);
				Savings.printIntrest();

			} else if (prompt.equals("setSeniorIntrest")) {

				Savings.printIntrest();
				System.out.println("Whar's the new intrest rate: ");
				money = sc.nextInt();
				setSavingsIntrest(money);
				Savings.printIntrest();

			}

			else if (prompt.equals("exit")) {
				isBankOn = false;
			}
		}

	}

	static public void setSavingsIntrest(int newIntrest) {
		Savings.intrestRate = newIntrest;
	}

	static public void setCheckingIntrest(int newIntrest) {
		Chequing.intrestRate = newIntrest;
	}

	static public void setSeniorIntrest(int newIntrest) {
		SeniorChild.intrestRate = newIntrest;
	}

	static public void payAccountHolders() {

	}

	static public void chargeServiceFees() {

	}

	static public void resetTransactions() {

	}
}
