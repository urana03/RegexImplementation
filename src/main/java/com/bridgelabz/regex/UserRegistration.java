package com.bridgelabz.regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static boolean checkFirstName(String name) throws Exception{
		
		
		try{
			String fName = "^[A-Z]{1}[a-z]{2,10}$";
			Pattern pattern = Pattern.compile(fName);		
			Matcher match = pattern.matcher(name);
		    return true;
			
		}
		catch(Exception e) {
			throw new Exception("Enter valid first name.");
		}
		
	}

	public static boolean checkLastName(String name) throws Exception{
		try {
		String lName = "^[A-Z]{1}[a-z]{2,10}$";
		Pattern pattern = Pattern.compile(lName);
		Matcher match = pattern.matcher(name);
		return match.matches();
		}
		catch(Exception e) {
			throw new Exception("Enter valid Last name");
		}
	}
	

	public static boolean checkPhone(String number) throws Exception{
		try {
		String phoneNumber = "\\d{10}$";
		Pattern pattern = Pattern.compile(phoneNumber);
		Matcher match = pattern.matcher(number);
		return match.matches();
		}
		catch(Exception e) {
			throw new Exception("Enter valid phone number");
			}
		}
	
public static boolean checkPassword(String password) throws Exception{
		try {
		String pass = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&*()_+=-]).{8,20}$";
		Pattern pattern = Pattern.compile(pass);
		Matcher match = pattern.matcher(password);
		return match.matches();
		}
		catch(Exception e){
			throw new Exception("Enter a valid password");
			}
		}

public static boolean checkEmail(String email) throws Exception{
	try {
	String pat = "^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@"+"[A-za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	Pattern pattern = Pattern.compile(pat);
	Matcher match = pattern.matcher(email);
	return match.matches();
	}
	catch(Exception e) {
		throw new Exception("Enter valid Email");
		}
	}
}



