package com.topic1;

import java.util.HashSet;
import java.util.Iterator;

public class MostExpensive implements FindItem {

	HashSet<Item> items;

	public MostExpensive(HashSet<Item> items) {
		this.items = items;

	}

	public Item find() {

		double expensive = 0;
		Item eItem = null;
		Iterator<Item> it = items.iterator();
		System.out.println(" " + (it.next()).getName()); // without this line
		// throw exception?
		while (it.hasNext()) {
			if (expensive < it.next().getPrice()) {
				expensive = it.next().getPrice();
				eItem = it.next();
			}
		}
		System.out.println("most expensive item: " + eItem.getName() + "-->" + eItem.getPrice());
		return eItem;
	}
}
