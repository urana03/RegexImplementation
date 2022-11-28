package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {

public static boolean checkFirstName(String name){
		
		String fName = "^[A-Z]{1}[a-z]{2,10}$";
		Pattern pattern = Pattern.compile(fName);
		
		if(name == null)
			return false;
		
		Matcher match = pattern.matcher(name);
		return match.matches();
		}
	
	public static void main(String args[]) {
	 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter last name: ");
		String lastName = scan.nextLine();
		System.out.print(checkFirstName(lastName));
		
	}
}
