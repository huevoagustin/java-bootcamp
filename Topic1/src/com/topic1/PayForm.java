package com.topic1;

import java.util.HashSet;

public abstract class PayForm {

	protected double discount; // % discount
	protected static HashSet<Item> items;

	public PayForm(double discount, HashSet<Item> items) {
		this.discount = discount;
		this.items = items;
	}

	public abstract double pay(double total);

}
