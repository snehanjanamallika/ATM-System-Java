package com.project;

import java.util.Random;
import java.util.Scanner;

public class ImplementationClass implements InterfaceForATMProject {

	Scanner sc=new Scanner(System.in);


	User u;

	ImplementationClass(User u) {
		this.u = u;
	}

	@Override
	public void checkBalance() {
		System.out.println("Availabe balance is:" + u.getBalance());
	}

	@Override
	public void Withdraw(double amount) {
		if (u.getBalance() < amount || u.getBalance() < 500) {
			System.out.println("InSufficient Balance");
		} else if (amount >= 50000) {
			System.out.println("You cannnot withraw more than 50000");
			System.out.println("Try again later...");
		} else {
			u.setBalance(u.getBalance() - amount);
			System.out.println("After withdrawl your current balance is:" + u.getBalance());
		}

	}

	@Override
	public void deposit(double amount) {

		if (amount >= 50000) {
			System.out.println("You cannot deposit more than 50000");
			System.out.println("Try again later...");
		} else {
			u.setBalance(u.getBalance() + amount);
			System.out.println("After depositing your balance is :" + u.getBalance());
		}
	}

	@Override
	public void changePin() {

		System.out.println("Enter Old Pin:");
		int pin1 = sc.nextInt();
		if (u.getPin() == pin1) {
			System.out.println("Enter new pin:");
			int new_pin = sc.nextInt();
			if (new_pin != pin1) {
				System.out.println("Confirm pin:");
				int confirm_pin = sc.nextInt();
				if (new_pin == confirm_pin) {
					u.setPin(confirm_pin);
					System.out.println("Your pin have been chnaged successfully");
				} else {
					System.out.println("Try again later...");

				}
			} else {
				System.out.println("Your new pin not be your old pin");
				System.out.println("Try again later...");
			}
		} else {
			System.out.println("Incorrect pin");
			System.out.println("Try again later...");
		}


	}


	@Override
	public void forgetPin() {

		Random r = new Random();
		int i = r.nextInt(1111, 9999);
		System.out.println("Your otp:" + i);
		System.out.println("Enter Otp:");
		int i1 = sc.nextInt();
		if (i == i1) {
			System.out.println("Enter new pin:");
			int new_pin = sc.nextInt();
			if (new_pin != u.getPin()) {
				System.out.println("Confirm pin:");
				int confirm_pin = sc.nextInt();
				if (new_pin == confirm_pin) {
					System.out.println("Your pin have been changed successfully");
					u.setPin(confirm_pin);
				} else {
					System.out.println("Your new pin doesn't match with confirm pin");
					System.out.println("Try again later...");
				}
			} else {
				System.out.println("Your new pin should not match with old pin");
				System.out.println("Try again later....");
			}

		} else {
			System.out.println("Your OTP is incorrect");
			System.out.println("Try again later...");
		}


	}

}
