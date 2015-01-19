package com.topic1;

import java.util.HashSet;

public class Cash extends PayForm {

	private FindItem fItem;

	public Cash(HashSet<Item> items) {
		super(90, items);
		this.fItem = new MostExpensive(items);
	}

	@Override
	public double pay(double total) {

		double mExpensive = (fItem.find()).getPrice();
		double free = (90 * mExpensive) / 100;
		return total - free;

	}

}
