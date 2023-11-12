import java.util.Scanner;
import java.util.Locale;
import classJavTreino.bankAccount;

public class bankAccountTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What the name of your account: ");
		String name = sc.next();
		int accountNum;
		int digitNumbers;
		float depValue;
		bankAccount account1;
		do {
			System.out.println("Enter with the 6 numbers of your account: ");
			sc.nextLine();
			accountNum = sc.nextInt();
			digitNumbers = String.valueOf(accountNum).length();

			if (digitNumbers < 6) {
				System.out.println("This account number is less than 6 digits, try again");
			}
			
			if (digitNumbers > 6) {
				System.out.println("This account number is more than 6 digits, try again");
			}
			
		}while(digitNumbers!= 6);
		
		System.out.println("You want make a first deposit?(Y/N)");
		String initDeposit = sc.next().toUpperCase();
		char depositAnwser = initDeposit.charAt(0);
		if (depositAnwser == 'Y') {
			System.out.println("What the value of Deposit: ");
			depValue = sc.nextFloat();
			account1 = new bankAccount(name, accountNum, depValue);
		}
		else {
			account1 = new bankAccount(name, accountNum);
		}
		System.out.println(account1);
		System.out.println("Make a deposit now: ");
		float deposit = sc.nextFloat();
		account1.deposit(deposit);
		System.out.println("Your balance now is $" + account1.getBalance());
		System.out.println("Make a withdraw: ");
		float withdraw = sc.nextFloat();
		account1.withdraw(withdraw);
		System.out.println("Your balance now is $" + account1.getBalance());
		
		sc.close();
	}

}