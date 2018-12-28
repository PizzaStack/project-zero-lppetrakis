package com.banking.BankingApp;

import java.sql.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Login login = new Login();
		Menu menu = new Menu();
		int input = 0;
		dbTransaction dbTrans = new dbTransaction(login);

		while (input != 7) {
			menu.printMainMenu();
			Scanner scanner = new Scanner(System.in);
			int options = scanner.nextInt();
			System.out.println(options);
			// TODO read input
			input = options;

			if (input == 1) {

				// login loop
				System.out.println("Login Selected");
				
				int privileges = 0;
				do {
					System.out.println("Enter Username: ");
					String username = scanner.next();
					System.out.println("User: " + username);
					System.out.println("Enter Password: ");
					String password = scanner.next();
					privileges = dbTrans.login(username, password);
					//dbTrans.login(username,password);
				} while (privileges == 0);
				
				
				//if no account, apply

				
				System.out.println("Auto Application: jake, jenny");
				dbTrans.apply("jake", "jenny");
				
				//dbTrans.approveApplication("jake");

				while (input != 7) {

					
					switch (privileges) {
					case 1:// admin
						while (input != 7) {// privileges 1 is admin
							menu.printAdminMenu();
							input = scanner.nextInt();
							System.out.println("Option chosen: " + input);
							// TODO switch input
							// TODO call db transaction on input
						}
						input = 1;
					case 2:// employee
						while (input != 7) {
							menu.printEmployeeMenu();
							input = scanner.nextInt();
							System.out.println("Option chosen: " + input);
							// TODO read input, net still not working
							// TODO switch input
							// TODO call db transaction on input
						}
						input = 1;
					case 3:
						if (privileges == 3) {// privileges
							while (input != 7) {
								menu.printUserMenu();
								input = scanner.nextInt();
								System.out.println("Option chosen: " + input);
								// TODO read input, net still not working
								// TODO switch input
								// TODO call db transaction on input
							}
							input = 1;
						}

					}
					// TODO read input
					// TODO DB transaction
					input = 7;
				}
			}

			if (input == 2) {// register user and add him to the users table
				while (input != 7) {
					System.out.println("Register selected.");
					System.out.println("Input User Name: ");
					// TODO check username doesn't already exist
					// TODO if exists, loop back
					String confirmPass;
					String username = scanner.next();
					String password;
					System.out.println("Username chosen: " + username);

					do {
						System.out.println("Input Password: ");
						confirmPass = scanner.next();
						System.out.println(confirmPass);
						System.out.println("Reinput Password: ");
						password = scanner.next();
						System.out.println(password);
//						System.out.println(password.equals(confirmPass));
					} while (!password.equals(confirmPass));
					dbTrans.register(username, password/* , dbTrans */);
					// if (!select username from users where exists (select username from users
					// where username = username))
					// insert into users values(username, password,,1);
					// else
					// reinput username
					input = 7;

				}

			}

//			input = 7;
		}
		System.out.println("Exiting...");

		try

		{
			Class.forName("org.postgresql.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		String url = "jdbc:postgresql://baasu.db.elephantsql.com:5432/rdcwpfvc";
		String username = "rdcwpfvc";
		String password = "38VnvHRGqfJQcfdYYMcFc0431eQCsNVS";

		try {
			Connection db = DriverManager.getConnection(url, username, password);
			Statement st = db.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM users");

			while (rs.next()) {
				System.out.print("Column 1 returned ");
				System.out.println(rs.getString(1));
				System.out.print("Column 2 returned ");
				System.out.println(rs.getString(2));
				System.out.print("Column 3 returned ");
				System.out.println(rs.getString(3));
				System.out.print("Column 4 returned ");
				System.out.println(rs.getString(4));
			}
			rs.close();
			st.close();
		} catch (java.sql.SQLException e) {
			System.out.println(e.getMessage());
		}

//        Menu mainMenu = new Menu();
//        mainMenu.printMainMenu();
//        mainMenu.printEmployeeMenu();
//        mainMenu.printAdminMenu();

	}
}
