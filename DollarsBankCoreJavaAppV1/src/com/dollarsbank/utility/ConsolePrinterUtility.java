package com.dollarsbank.utility;

public class ConsolePrinterUtility {

private void printRegisterData(Register register) {
		
		System.out.println(register.getFirstName());
		System.out.println(register.getLastName());
		System.out.println(register.getEmailId());
		System.out.println(register.getPassword());
		System.out.println(register.getPhoneNo());
		
	}
}
