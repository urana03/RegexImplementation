package com.bridgelabz.regex;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.Test;

@RunWith(Parameterized.class)
public class EmailTest {

	private String emailToTest;
	private boolean expectedResult;
	
	
	public EmailTest(String email, boolean expectedResut) {
		this.emailToTest = email;
		this.expectedResult = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
		
			{"abc@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@y1.com",true},
			{"abc@gmail.com",true},
			{"abc+100@gmail.com",true},
		});
	}
	@Test
	public void givenEmail_ShouldCheckAsPerCondition() {
		Email check = new Email();
		boolean result = Email.checkEmail(this.emailToTest);
		assertEquals(this.expectedResult ,result);
	}	
	
}
	


