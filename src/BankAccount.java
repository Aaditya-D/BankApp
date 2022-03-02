import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Account{
	
		int balance;
		int lastTansaction;
		String user;
		int userId;
		
		Account(String Customer, int Id) {
			this.user=Customer;
			this.userId=Id;
		}
		
		void deposit(int amount) {
		
			if(amount != 0) {
				balance = balance + amount;
				lastTansaction = amount;
			}
		}
		
		void withdraw(int amount) {
			
			if(amount != 0) {
				balance = balance - amount;
				lastTansaction =- amount;
			}
		}
		
		void getPreviousTransaction() {
			
			if(lastTansaction > 0) {
				System.out.println("Deposited: "+lastTansaction);
			}
			else if (lastTansaction < 0) {
				System.out.println("Withdrawn: "+Math.abs(lastTansaction));
			}
			else {
				System.out.println("No transaction Occured");
			}
		}
		
		void showMenu() {
			char option = '\0';
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome "+user);
			System.out.println("your Id is "+userId);
			System.out.println("\n");
			System.out.println("Press A For Account Balance");
			System.out.println("Press B For Deposit");
			System.out.println("press C For Withdraw");
			System.out.println("Press D For Previous Transaction");
			System.out.println("press E For Exit");
			
			do {
				System.out.println("\t Enter An Option");
				option = sc.next().charAt(0);
				System.out.println("\n");
			
				switch(option) {
					
				case 'A':
					System.out.println("Balance: "+balance);
					System.out.println("\n");
				break;
				case 'B':
					System.out.println("Enter An Amount To Deposit: ");
					int amount = sc.nextInt();
					deposit(amount);
					System.out.println("\n");
				break;
				case 'C':
					System.out.println("Enter An Amount To Withdraw: ");
					int amount2 = sc.nextInt();
					withdraw(amount2);
					System.out.println("\n");
				break;
				case 'D':
					System.out.println("Getting previous transaction");
					getPreviousTransaction();
					System.out.println("\n");
				break;
				case 'E':
					System.out.println("/tExiting...............");
					break;
				default:
					System.out.println("Invalid input ! Please try Again");
					break;
				}
			
		}while(option != 'E');
			System.out.println("Thank You For Using Our Service !!! ");
		}
	}
}

