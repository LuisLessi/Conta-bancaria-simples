package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.Exceptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, limit);
		
		System.out.print("\nEnter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		acc.deposit(amount);
		acc.withDraw(amount);
		
		System.out.println(acc.toString());
		
		} catch (Exceptions e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("unexpected error");
		}
		
		sc.close();
	}

}
