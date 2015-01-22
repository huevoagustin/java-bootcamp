package com.playlist;

import java.util.Scanner;
// concrete state
public class Play implements PlayerState{

	@Override
	public void play(AudioPlayer context) {
		System.out.println(" > Playing...");
		
	}

	@Override
	public void pause(AudioPlayer context) {
		context.setState(new Pause());
		System.out.println("|| Pause");
	}

	@Override
	public void stop(AudioPlayer context) {
		context.setState(new Stop());
		System.out.println("Stop!");
		
	}

	
	

}
