import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		BankAccount User = new BankAccount(1000);
		ATM Atm = new ATM(User);
		Atm.Run();
	}
}
class BankAccount{
	private double balance;

	public BankAccount(double init_Balance) {
		balance = init_Balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void check_Balance() {
		System.out.println("Balance Amount :" + balance);
	}

	public void withdrawal(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient Balance...");
		}
	}
}

class ATM {
	private BankAccount account;

	public ATM(BankAccount bankaccount) {
		account = bankaccount;
	}

	public void Menu() {
		System.out.println("\n\tATM Menu:");
		System.out.println("\n\t1.Withdrawal");
		System.out.println("\n\t2. Deposit");
		System.out.println("\n\t3. Check Balance");
		System.out.println("\n\t4. Exit");
	}

	public void Run() {

		int PIN = 1234;
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println("\nEnter Your PIN :");
		int pin = in.nextInt();
		if (pin == PIN) {
			while (true) {
				Menu();
				{
					System.out.println();
					System.out.println("\nEnter Your Option : ");
					int n = in.nextInt();
					switch (n) {
					case 1:
						System.out.println("Enter the Amount to Widthdraw : ");
						double amount = in.nextDouble();
						account.withdrawal(amount);
						System.out
								.println("Please Wait Your Amount is Generating...Collect Your Cash " + amount + "...");
						break;
					case 2:
						System.out.println("Enter the Amount :");
						double amount1 = in.nextDouble();
						account.deposit(amount1);
						System.out.println("Your Amount is Deposited Successfully...");
						break;
					case 3:
						account.check_Balance();
						break;
					case 4:
						System.out.println("Thankyou...Visit Again");
						in.close();
						break;
					}

				}

			}

		} else {
			System.out.println("Invalid Pin...");
			in.close();
		}
	}
}
