package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

public static boolean checkLastName(String email){
		
		String pat = "^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@"+"[A-za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(pat);
		
		if(email == null)
			return false;
		
		Matcher match = pattern.matcher(email);
		return match.matches();
		}
	
	public static void main(String args[]) {
	 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Email Here : ");
		String email = scan.nextLine();
		System.out.print(checkLastName(email));
		

	}
}