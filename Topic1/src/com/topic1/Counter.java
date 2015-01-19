package com.topic1;

public class Counter {

	private static Counter counter = null;
	private int tNumber = 0;

	private Counter() {

	}

	public static Counter getInstance() {

		if (counter == null) {
			return new Counter();
		}
		return counter;
	}

	public int getNumber() {

		this.tNumber++;
		return this.tNumber;
	}

}
