package com.bridgelabz.regex;

import static org.junit.Assert.*;

import org.junit.Test;

public class LastNameTest {
		
		LastName check = new LastName();
		
		@Test
		public void givenLastName_WhenProper_ShouldReturnTrue() {
			assertTrue(check.checkLastName("Rana"));
		}
		
		@Test
		public void givenLastName_WhenShort_ShouldReturnFalse() {
			assertFalse(check.checkLastName("Ra"));
		}
		
		@Test
		public void givenFirstName_WithSymbols_ShouldReturnFalse() {
			assertFalse(check.checkLastName("Rana@"));
		}
		
}


