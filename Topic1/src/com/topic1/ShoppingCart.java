package com.topic1;

import java.util.HashSet;
//import java.util.HashSet;
//import java.util.Iterator;
import java.util.Iterator;
import java.util.Scanner;

public class ShoppingCart {

	private PayForm pForm;
	private HashSet<Item> items;
	private boolean payed;
	Counter counter = Counter.getInstance();

	ShoppingCart() {
		this.items = new HashSet<Item>();
		this.payed = false;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void deleteItem(Item item) {
		items.remove(item);
	}

	public String toString() {
		return "ShoppingCart --> items = \n" + items;
	}

	public double getTotalAmount() {

		double total = 0.0;
		Iterator<Item> it = items.iterator();
		while (it.hasNext()) {
			total = total + it.next().getPrice();
		}
		System.out.println("Total : " + total);
		return total;

	}

	public void setPayForm(PayForm pForm) {
		this.pForm = pForm;
	}

	public void pay() {

		double total = this.getTotalAmount();
		Scanner in = new Scanner(System.in);
		System.out.println("how do you pay? (1)-Credit Card (2)-Pay Pal (3)-Cash");
		int option = in.nextInt();
		switch (option) {
		case 1:
			pForm = new CreditCard(items);
			break;
		case 2:
			pForm = new Paypal(items);
			break;
		case 3:
			pForm = new Cash(items);
			break;
		}
		System.out.println("total : " + this.pForm.pay(total));
		System.out.println("ID payment transaction: " + counter.getNumber());
		this.payed = true;
	}
}
