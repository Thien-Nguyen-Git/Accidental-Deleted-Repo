package com.dollarsbank.model;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Enter username : ");
			String userName = scanner.nextLine();
			
			System.out.print("Enter password : ");
			String password = scanner.nextLine();
			
			if ("customer".equals(userName) && "password".contentEquals(password)) {
				System.out.println("User is successfully logged in ... ");
			} else {
				System.out.println("Invalid username or password");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
