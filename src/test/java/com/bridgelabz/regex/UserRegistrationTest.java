package com.bridgelabz.regex;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {


	UserRegistration check = new UserRegistration();
	
	@Test
	public void givenInvalidFirstNameThrowsCustomException() {
	    try {
		    check.checkFirstName(null);
		}
		catch(Exception e) {
			e.printStackTrace();
			}
	    }
	
	@Test
    public void givenInvalidLastNameThrowsCustomException() {
		    try {
			    check.checkLastName(null);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void givenInvalidPhoneNumberThrowsCustomException() {
        try {
		    check.checkPhone(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}

	@Test
    public void givenInvalidPasswordThrowsCustomException() {
	    try {
		    check.checkPassword(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
	
	@Test
     public void givenInvalidEmailThrowsCustomException() {
	    try {
		    check.checkEmail(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}

}
