package com.topic1;

import java.util.HashSet;
import java.util.Scanner;

public class CreditCard extends PayForm {

	String name;
	int ccNumber;

	public CreditCard(HashSet<Item> items) {
		super(10, items);
		Scanner in = new Scanner(System.in);
		System.out.println("name? : ");
		this.name = in.next();
		System.out.println("credit card number? : ");
		this.ccNumber = in.nextInt();

	}

	@Override
	public double pay(double total) {

		return total - ((this.discount * total) / 100);
	}
}
