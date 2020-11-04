package com.thien.start;

public class Application {

	public static void main(String[] args) {
		
		int var1;
		int var2;
		int var3;
		
		System.out.println("+---------------------------+");
		System.out.println("| DOLLARSBANK Welcomes You! |");
		System.out.println("+---------------------------+");
		
		System.out.println("1. Create New Account");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		System.out.println("\n");
		
		do {
			
			System.out.println("Enter Choices ( 1 | 2 | 3 )");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case '1':
				break;
				
			case '2':
				break;
				
			case '3':
				System.out.println("********************************");
				break;
				
			default:
				System.out.println("Invalid Option! Please enter again");
				System.out.println("\n");
				break;
				
			}
			
		} while (option != '3');
		
		System.out.println("Thank you for using our services");
	}
	
}
