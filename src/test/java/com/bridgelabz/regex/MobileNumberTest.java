package com.bridgelabz.regex;

import static org.junit.Assert.*;

import org.junit.Test;

public class MobileNumberTest {

	MobileNumber check = new MobileNumber();
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		assertTrue(check.checkPhone("8282828282"));
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		assertFalse(check.checkPhone("0300339"));
	}
	
	@Test
	public void givenFirstName_WithSymbols_ShouldReturnFalse() {
		assertFalse(check.checkPhone("838383893@"));
	}
	

}
