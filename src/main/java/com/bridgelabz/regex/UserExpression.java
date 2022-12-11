package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserValidation{
	boolean check(String regex);
}

public class UserExpression {

	static String entered;
	
	public static void main(String args[]) {
		//Using lambda expression
		UserValidation validate = (String regex) ->{
		Pattern pattern = Pattern.compile(regex);
		if(entered == null)
			return false;
		Matcher match = pattern.matcher(entered);
		return match.matches();
		};
		Scanner scan = new Scanner(System.in);
		//Checking First Name
		String firstName="^[A-Z]{1}[a-z]{2,10}$";
		System.out.print("Enter first name: ");
		entered = scan.next();
		System.out.println(validate.check(firstName));
		// Checking Last Name
		String lastName="^[A-Z]{1}[a-z]{2,10}$";
		System.out.print("Enter last name: ");
		entered = scan.next();
		System.out.println(validate.check(lastName));
		//Checking Mobile Number
		String phone="\\d{10}$";
		System.out.print("Enter Mobile Number: ");
		entered = scan.next();
		System.out.println(validate.check(phone));
		//Checking Password
		String pass="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&*()_+=-]).{8,20}$";
		System.out.print("Enter password: ");
		entered = scan.next();
		System.out.println(validate.check(pass));
		//Checking Email
		String email="^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@"+"[A-za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		System.out.print("Enter email: ");
		entered = scan.next();
		System.out.println(validate.check(email));
		 
	}
}