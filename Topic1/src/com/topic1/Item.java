package com.topic1;

public class Item {

	private String name;
	private double price;
	private int code;

	public Item(String name, double price, int code) {

		this.name = name;
		this.price = price;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public double getPrice() {
		return price;
	}

	/*
	 * public void setPrice(double price) { this.price = price; }
	 */

	public int getCode() {
		return code;
	}

	public String toString() {
		return name + "...... $" + price + "\n";
	}

	/*
	 * public void setCode(int code) { this.code = code; }
	 */

}
