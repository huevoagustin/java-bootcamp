package com.topic1;

public class IndividualOffer implements Offer {

	Item item;
	String oName;
	double price;

	public IndividualOffer(Item item, String oName, double price) {

		this.oName = oName;
		this.price = price;
		this.item = item;
	}

	public void displayOffer() {

		System.out.println(this.oName + "...." + this.price); // offer price
		System.out.println(this.item.getName() + "...." + this.item.getPrice());// normally
																				// item
																				// price
	}

}
