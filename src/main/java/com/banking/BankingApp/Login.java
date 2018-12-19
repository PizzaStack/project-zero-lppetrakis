package com.banking.BankingApp;

public class Login{
	private String username;
	private String password;
	private int id;
	private int priviledges;
	
	public String getUsername() {return this.username;}
	public String getPassword() {return this.password;}
	public int getId() {return this.id;}
	public int getPriviledges() {return this.priviledges;}
	
	public Login() {
		this.username = "default";
		this.password = "password";
		this.id = 0;
		this.priviledges = 0;		
	}
	public Login(String username, String password, int id, int priviledges) {
		this.username = username;
		this.password = password;
		this.id = id;
		this.priviledges = priviledges;
	}
	
	
}