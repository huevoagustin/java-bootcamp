package com.topic1;

public interface Subject {

	public void addObserver(Observer observer);

	public void removeObserver(Observer Observer);

	public void doNotify();

}
