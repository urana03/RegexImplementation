package com.bridgelabz.regex;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNameTest {

	
	FirstName check = new FirstName();
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		assertTrue(check.checkFirstName("Uttam"));
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		assertFalse(check.checkFirstName("Ut"));
	}
	
	@Test
	public void givenFirstName_WithSymbols_ShouldReturnFalse() {
		assertFalse(check.checkFirstName("Uttam@"));
	}
}
