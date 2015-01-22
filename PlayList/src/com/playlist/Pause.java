package com.playlist;

import java.util.Scanner;
// concrete state
public class Pause implements PlayerState{

	@Override
	public void play(AudioPlayer context) {
		context.setState(new Play());
		System.out.println(" > Playing...");
	}

	@Override
	public void pause(AudioPlayer context) {
		System.out.println("it is pause now!");
	}

	@Override
	public void stop(AudioPlayer context) {
		context.setState(new Stop());
		System.out.println(" Stop!");
	}

	
	

}
