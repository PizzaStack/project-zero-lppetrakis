package com.banking.BankingApp;

public class Menu{
	
	public void switchInputMenu(int input)
	{
		switch(input) {
		case 1:
			System.out.println("Print Application");
			break;
		case 2:
			System.out.println("Deny Application");
			break;
		case 3:
			System.out.println("Withdraw");
			break;
		case 4:
			System.out.println("Deposit");
			break;
		case 5:
			System.out.println("Transfer");
			break;
		case 6:
			System.out.println("Cancel Account");
			break;
		case 7:
			break;
		
		}
	}
	public void printMainMenu() {
		System.out.println("Select an option:\n" + "1. Login\n2. Register");
		this.printExit();

	}
	public void printEmployeeMenu() {
		System.out.println("Options:\n1. Print Application");
		this.printExit();

	}
	
	public Menu() {}
	
	public void printAdminMenu() {
		System.out.println("Options:\n1. Print Application\n2. Deny Application\n3. Withdraw\n4. Deposit\n5. Transfer\n6. Cancel Account");
		this.printExit();

	}
	public void printUserMenu() {
		System.out.println("options:\n3. Withdraw\n4. Deposit\n5. Transfer");
		this.printExit();
	}
	
	public void printExit() {
		System.out.println("7. Exit");
	}
}