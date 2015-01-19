package com.topic1;

import java.util.HashSet;
import java.util.Iterator;

public class Cheapest implements FindItem {

	HashSet<Item> items;

	public Cheapest(HashSet<Item> items) {
		this.items = items;
	}

	public Item find() {

		double cheapest = 1000;
		Item cItem = null;
		Iterator<Item> it = items.iterator();
		while (it.hasNext()) {
			if (cheapest > it.next().getPrice()) {
				cheapest = it.next().getPrice();
				cItem = it.next();
			}
		}
		System.out.println("cheapest item: " + cItem.getName() + "-->" + cItem.getPrice());
		return cItem;
	}

}
