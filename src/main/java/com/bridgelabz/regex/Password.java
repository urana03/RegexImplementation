package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

public static boolean checkLastName(String password){
		
		String pass = "^[A-Za-z]{8,20}$";
		Pattern pattern = Pattern.compile(pass);
		
		if(password == null)
			return false;
		
		Matcher match = pattern.matcher(password);
		return match.matches();
		}
	
	public static void main(String args[]) {
	 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Password Here : ");
		String password = scan.nextLine();
		System.out.print(checkLastName(password));
		

	}
}
