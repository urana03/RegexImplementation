package com.bridgelabz.regex;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswoedTest {

	Password check = new Password();
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		assertTrue(check.checkPassword("Uttamrana@1"));
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		assertFalse(check.checkPassword("Uttam"));
	}
	
	@Test
	public void givenFirstName_WithoutSymbol_ShouldReturnFalse() {
		assertFalse(check.checkPassword("Uttamrana1"));
	}
	
}
