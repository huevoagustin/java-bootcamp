package com.topic1;

import java.util.HashSet;
import java.util.Scanner;

public class Paypal extends PayForm {

	private String email;
	private String password;
	FindItem fItem;

	public Paypal(HashSet<Item> items) {
		super(0, items); // no discount

		Scanner in = new Scanner(System.in);
		System.out.println("email? : ");
		this.email = in.next();
		System.out.println("password? : ");
		this.password = in.next();
		this.fItem = new Cheapest(items);
	}

	public double pay(double total) {

		return total - (this.fItem.find()).getPrice();
	}

}
