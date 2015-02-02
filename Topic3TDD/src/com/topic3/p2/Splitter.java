package com.topic3.p2;

import java.util.ArrayList;
import java.util.List;


public class Splitter {

	public static List<String> split(String string, int size) {
		/*
		 * return a List<String> that contains the string
		 * splitted in size parts
		 * if the string/substring begin with ' ' do not take into account and continue with 
		 * the next character
		 */
		
		List<String> result = new ArrayList<String>((string.length() + size - 1) / size);
		
		for(int i = 0; i < string.length(); i += size){
			if (string.charAt(i) != ' ') {
				result.add(string.substring(i, Math.min(string.length(), i + size)));
			}
			else
				i = i - size + 1;
		}
		return result;
	}

	
}
