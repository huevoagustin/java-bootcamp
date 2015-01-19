package com.topic1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		ShoppingCart sCart = new ShoppingCart();
		Item item1 = new Item("soap", 7.5, 1);
		Item item2 = new Item("steak", 20.25, 113);
		Item item3 = new Item("sugar", 4.5, 59);
		Item item4 = new Item("bines", 10.5, 65);
		Item item5 = new Item("milk", 5.15, 60);

		sCart.addItem(item1);
		sCart.addItem(item2);
		sCart.addItem(item3);
		sCart.addItem(item4);
		sCart.addItem(item5);

		System.out.println(sCart.toString());

		sCart.pay();
	}

}
