package Bank;
import java.util.*;
public class BankAccount {

	public static int accountNo;
	private static String accountHolderName;
	private double balance=0;

	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Current Balance is: "+balance);
		
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Current Balance is: "+balance);
	}
	public void DisplayBalance() {
		System.out.println("Account No: "+accountNo);
		System.out.println("User Name: "+accountHolderName);
		System.out.println("Current Balance is: "+balance);
	}
	public static void main(String[] args) {
	
		BankAccount b1=new BankAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		accountNo=sc.nextInt();
		System.out.println("Enter Your name: ");
		accountHolderName=sc.next();
		int ch;
		do {
	    System.out.println();
	    System.out.println("=== Bank Account Simulator ===");
		System.out.println("Enter your Choice:");
		System.out.println(" 1.Deposit ");
		System.out.println(" 2.Withdraw ");
		System.out.println(" 3.Current Balance ");
		System.out.println(" 4.Exit");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
	     ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter Amount: ");
			b1.deposit(sc.nextDouble());
			break;
		
		case 2:
			System.out.println("Enter Amount: ");
			b1.withdraw(sc.nextDouble());
			break;
			
		case 3:
			b1.DisplayBalance();
			break;
			
		case 4:
			System.out.println("Visit Again. Thank you!");
			break;
			
		default:
			System.out.println("Please Enter Correct Choice... ");
			break;
		}
	}while(ch!=4);
	
	

	}

}
