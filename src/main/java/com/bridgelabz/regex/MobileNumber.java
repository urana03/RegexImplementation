package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {

public static boolean checkPhone(String number){
		
		String phoneNumber = "\\d{10}$";
		Pattern pattern = Pattern.compile(phoneNumber);
		
		if(number == null)
			return false;
		
		Matcher match = pattern.matcher(number);
		return match.matches();
		}
	
	public static void main(String args[]) {
	 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter mobile number(+91): ");
		String number = scan.next();
		System.out.print(checkPhone(number));
		
	}
}
