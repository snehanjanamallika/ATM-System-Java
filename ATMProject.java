package com.project;

import java.util.Scanner;

public class ATMProject {

	static Scanner sc = new Scanner(System.in);
	static User imp1 = new User(12345678L, "Mallika", 10000, 1234);
	static User imp2 = new User(98765432L, "Renuka", 1500, 4321);
	static User imp3 = new User(94920505L, "Sneha", 2000, 9876);
	static User imp4 = new User(9441823L, "Renu", 2500, 1144);

	static User[] arr = { imp1, imp2, imp3, imp4 };

	public static void main(String[] args) {

		System.out.println("Enter account number:");
		long num = sc.nextLong();
		User current_user = null;

		for (int i = 0; i < arr.length; i++) {

			if (num == arr[i].getAccountNumber()) {
				System.out.println("Welcome to the Banking " + arr[i].getAccountHolderName());
				System.out.println("Your account number is :" + arr[i].getAccountNumber());
				System.out.println("Enter your pin :");
				int p1 = sc.nextInt();
				if (p1 == arr[i].getPin()) {
					System.out.println("You have logged in successfully");
					
					current_user = arr[i];
//					System.out.println(current_user.toString());
					break;
				} else {
					System.out.println("You have entered wrong pin");
					System.out.println("Try again later...");
					System.exit(0);
					break;
				}

			}
		}

		InterfaceForATMProject i = new ImplementationClass(current_user);

		int num1;
		do {

			System.out.println("Choose among the following options:");
			System.out.println("1.Check Balance:");
			System.out.println("2.Withdrawl");
			System.out.println("3.Deposit");
			System.out.println("4.Change pin");
			System.out.println("5.Forget pin");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				i.checkBalance();
				break;
			case 2:
				System.out.println("Enter amount to withdraw:");
				double amo = sc.nextInt();
				i.Withdraw(amo);
				break;
			case 3:
				System.out.println("Enter amount to deposit:");
				double amou = sc.nextInt();
				i.deposit(amou);
				break;
			case 4:
				i.changePin();
				break;
			case 5:
				i.forgetPin();
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
			
			
			System.out.println("Do you want to continue:(yes:1):(no:0)");
			System.out.println("---------------------------------------------");
//			Scanner s=new Scanner(System.in);
	
			num1 = sc.nextInt();
		} while (num1==1);

	}

}
