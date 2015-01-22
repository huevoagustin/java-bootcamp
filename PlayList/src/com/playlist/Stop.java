package com.playlist;

import java.util.Scanner;
// concrete state
public class Stop implements PlayerState{

	@Override
	public void play(AudioPlayer context) {
		context.setState(new Play());
		System.out.println(">Playing..");
		
	}

	@Override
	public void pause(AudioPlayer context) {
		System.out.println("you can't pause");
		this.stop(context);
	}

	@Override
	public void stop(AudioPlayer context) {
		System.out.println("it is Stop now!");
		
	}

	
	

}
