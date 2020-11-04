package com.dollarsbank.model;

import java.util.Scanner;

public class SavingsAccount {
	
public static void main(String[] args) {
		
		Register register = new Register();
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Customer Name : ");
			String name = scanner.nextLine();
			register.setName(name);
			
			System.out.println("Customer Address : ");
			String address = scanner.nextLine();
			register.setAddress(address);
			
			System.out.println("User ID : ");
			String userId = scanner.nextLine();
			register.setUserId(userId);
			
			System.out.println("Password : ");
			String password = scanner.nextLine();
			register.setPassword(password);
			
			System.out.println("Customer Contact Number : ");
			long contactNumber = scanner.nextLong();
			register.setContactNumber(contactNumber);
			
			System.out.println("Initial Deposit Amount : ");
			double initialDeposit = scanner.nextDouble();
			register.setInitialDeposit(initialDeposit);
			
			printRegisterData(register);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private static void printRegisterData(Register register) {
		
		System.out.println("Customer Name\t\t" + register.getName());
		System.out.println("Customer Address\t" + register.getAddress());
		System.out.println("Customer ID\t\t" + register.getUserId());
		System.out.println("Customer Password\t" + register.getPassword());
		System.out.println("Customer Contact\t" + register.getContactNumber());
		System.out.println("Initial Deposit\t\t" + register.getInitialDeposit());
		
	}

}


class Register {
	
	private String name;
	private String address;
	private String userId;
	private String password;
	private long contactNumber;
	private double initialDeposit;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	
}