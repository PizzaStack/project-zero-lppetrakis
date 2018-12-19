package com.banking.BankingApp;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Login login = new Login();
		Menu menu = new Menu();
		int input = 0;

		while (input != -1) {
			menu.printMainMenu();
			// TODO read input
			input = 1;
			if (input == 1) {
				while (input != -1) {

					int priviledges = 1;
					if (priviledges == 1) {
						while (input != -1) {
							menu.printAdminMenu();
							// TODO read input, net still not working
							// TODO switch input
							// TODO call db transaction on input
						}

					}
					priviledges = 2;
					if (priviledges == 2) {
						while (input != -1) {
							menu.printEmployeeMenu();
							// TODO read input, net still not working
							// TODO switch input
							// TODO call db transaction on input
						}
					}
					priviledges = 3;
					if (priviledges == 3) {
						while (input != -1) {
							menu.printUserMenu();
							// TODO read input, net still not working
							// TODO switch input
							// TODO call db transaction on input
						}
					}
					// TODO read input
					// TODO DB transaction
					input = -1;
				}
			}
			if (input == 2) {
				while (input != -1) {
					// TODO internet busted, can't find correct read syntax, do in morning
					// register for account
					// TODO read username
					// TODO read password
					// TODO check db for password
					// TODO if already in db, print need new username
					// TODO if not in db, post registration success and add to db
				}

			}

			input = -1;
		}

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
//            st.executeQuery("insert into users values('default2', 'password2', 1, 0)");

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
