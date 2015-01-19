package com.topic1;

public class CompositeOffer implements Offer {

	Offer offer;

	public CompositeOffer(Offer offer) {

		this.offer = offer;

	}

	public void displayOffer() {

		offer.displayOffer();
	}

}
