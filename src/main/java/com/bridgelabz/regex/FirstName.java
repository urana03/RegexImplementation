package com.bridgelabz.regex;

import java.util.*;
import java.util.regex.*;

public class FirstName {

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
		System.out.print("Enter first name: ");
		String firstName = scan.nextLine();
		System.out.print(checkFirstName(firstName));
		
	}
}