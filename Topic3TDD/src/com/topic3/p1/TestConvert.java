package com.topic3.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConvert {

	
	
	@Test
	public void testLenghtNumber() {
		assertEquals(2, new Amount().length(25));
	}
	
	@Test
	public void testConvertNumberToText() {
		assertEquals("two thousand five hundred twenty-three", new Amount().convert(2523));
	}
			
	@Test
	public void testConvertWholeNumberToText() {
		assertEquals("two thousand five hundred twenty-three 04/100 dollars", new Amount().convertNumber(2523.04));
	}

}
