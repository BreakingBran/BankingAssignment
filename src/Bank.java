import java.util.*;

import com.sun.org.apache.xml.internal.dtm.ref.EmptyIterator;

public class Bank {

	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		// Number of people in the bank
		// int numberOfMembers = sc.nextInt();
		// Bank ourBank = new Bank();

		// Hello Charisa

		int totalMoneyInvested; // 8===D

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

		System.out
				.println("Welcome to the bank: \nInsert your set of instructions");

		while (isBankOn) {
			System.out.print("> ");
			prompt = sc.next().toLowerCase();

			if (prompt.equals("new")) {
				System.out
						.println("What type of account (senior/savings/chequing): ");
				String accountType = sc.next().toLowerCase();

				if (accountType.equals("savings") || accountType.equals("sa")) {
					System.out.println("Initial Amount: ");
					money = sc.nextInt();
					Savings member = new Savings(money);
					accountMembers.add(member);
					savingsCounter += 1;

				}

				else if (accountType.equals("chequing")) {
					System.out.println("Initial Amount: ");
					money = sc.nextInt();
					Chequing member = new Chequing(money);
					accountMembers.add(member);
					checkingCounter += 1;
				}

				else if (accountType.equals("senior")) {
					System.out.println("Initial Amount: ");
					money = sc.nextInt();
					SeniorChild member = new SeniorChild(money);
					accountMembers.add(member);
					seniorCounter += 1;

				}
			}

			else if (prompt.equals("setsi")) {

				Savings.printIntrest();
				System.out.println("Whar's the new intrest rate: ");
				money = sc.nextInt();
				setSavingsIntrest(money);
				Savings.printIntrest();

			} else if (prompt.equals("setci")) {

				Savings.printIntrest();
				System.out.println("Whar's the new intrest rate: ");
				money = sc.nextInt();
				setCheckingIntrest(money);
				Savings.printIntrest();

			} else if (prompt.equals("setsci")) {

				Savings.printIntrest();
				System.out.println("What's the new intrest rate: ");
				money = sc.nextInt();
				setSavingsIntrest(money);
				Savings.printIntrest();

			}

			else if (prompt.equals("monthly")) {
				monthlyRoutine(accountMembers);
			}

			else if (prompt.toLowerCase().equals("exit")) {
				isBankOn = false;
			}

			else {
				System.out.println("Command not recognized, please try again.");
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

	// List<Account> accountMembers = new ArrayList<Account>();

	static public void payAccountHolders(List<Account> accountMembers)
			throws Exception {
		// loops through all members and pays them intrest
		if (accountMembers.size() == 0) {
			System.out.println("Say what?");
			throw new Exception("accountMembers is empty you fool");
		}
		for (int i = 0; i < accountMembers.size(); i++) {
			accountMembers.get(i).payIntrest();
		}
	}

	static public void chargeServiceFees(List<Account> accountMembers) {
		// loops through all members and deducts service charge
		for (int i = 0; i < accountMembers.size(); i++) {
			accountMembers.get(i).deductServiceCharge();
		}
	}

	static public void resetTransactions(List<Account> accountMembers) {
		// loops through all members resets their transactions to 0
		for (int i = 0; i < accountMembers.size(); i++) {
			accountMembers.get(i).resetTransaction();
		}
	}

	static public void monthlyRoutine(List<Account> accountMembers) {
		/*
		 * loops through all members and pays them intrest deducts service
		 * charges resets transaction and forces user to set new intrest rates
		 */
		for (int i = 0; i < accountMembers.size(); i++) {
			accountMembers.get(i).payIntrest();
			accountMembers.get(i).deductServiceCharge();
			accountMembers.get(i).resetTransaction();
		}

		System.out.println("Set new savings intrest: ");
		setSavingsIntrest(sc.nextInt());
		System.out.println("Set new checking intrest: ");
		setCheckingIntrest(sc.nextInt());
		System.out.println("Set new senior intrest: ");
		setSeniorIntrest(sc.nextInt());
	}
}
