package com.banking.BankingApp;

public class Menu{
	
	public void printMainMenu() {
		System.out.println("Select an option:\n" + "1. Login\n2. Register");
	}
	public void printEmployeeMenu() {
		System.out.println("Options:\n1. Print Application");
	}
	
	public Menu() {}
	
	public void printAdminMenu() {
		System.out.println("Options:\n1. Print Application\n2. Deny Application\n3. Withdraw\n4. Deposit\n5. Transfer\n6. Cancel Account");
	}
	public void printUserMenu() {
		System.out.println("options:\n3. Withdraw\n4. Deposit\n5. Transfer");
	}
}