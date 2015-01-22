package com.playlist;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		AudioPlayer aPlayer = new AudioPlayer();
		
		PlayerState stopState = new Stop();
		PlayerState playState = new Play();
		PlayerState pauseState = new Pause();
		
		
		
		stopState.play(aPlayer);
		
		playState.pause(aPlayer);
		
		pauseState.stop(aPlayer);
		
		stopState.pause(aPlayer);
		
						
	}

}

