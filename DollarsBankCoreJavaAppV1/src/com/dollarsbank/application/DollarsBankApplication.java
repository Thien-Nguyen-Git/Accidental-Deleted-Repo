package com.dollarsbank.application;

import java.util.Scanner;

import com.dollarsbank.model.Account;

public class DollarsBankApplication {

	public static void main(String[] args) {
		
		Account obj1 = new Account("XYZ", "AB0001");
		obj1.showMenu();
		
	}
}

