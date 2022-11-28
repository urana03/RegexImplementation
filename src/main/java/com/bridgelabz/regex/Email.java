package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

public static boolean checkLastName(String email){
		
		String pass = "^[a-z]+(\\.[a-z]+)*@"+"[a-z]+(\\.[a-z]+)*(\\.[a-z]{2,})$";
		Pattern pattern = Pattern.compile(pass);
		
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