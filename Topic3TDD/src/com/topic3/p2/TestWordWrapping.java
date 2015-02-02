package com.topic3.p2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestWordWrapping {

	@Test
	public void testToSplit() {
		List<String> result = new ArrayList<String>();
		result.add("a b");
		result.add("c d");
		result.add("e f");
		assertEquals(result, Splitter.split("a b c d e f", 3));
	}
	
	
}
