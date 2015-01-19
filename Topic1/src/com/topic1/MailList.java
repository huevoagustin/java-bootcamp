package com.topic1;

import java.util.HashSet;
import java.util.Iterator;

public class MailList implements Subject {

	HashSet<Observer> observers;
	String change;

	public MailList() {
		observers = new HashSet<Observer>();

	}

	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	public void doNotify() {
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext()) {
			Observer observer = it.next();
			observer.doUpdate(change);
		}

	}

	public void setChange() {

		System.out.println("change message");
		doNotify();
	}
}
