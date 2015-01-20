package com.playlist;

import java.util.Scanner;

public class Play implements PlayerState{

	
	public void execute(AudioPlayer aPlayer) {
		System.out.println(" > Playing...");
		aPlayer.setState(this);
		Scanner in = new Scanner(System.in);
		String action;
		System.out.println("<(p)ause/(s)top>");
		action = in.next();
		
		switch (action){
		case "p": 
			PlayerState pause = new Pause();
			pause.execute(aPlayer);
			break;
		case "s":
			PlayerState stop = new Stop();
			stop.execute(aPlayer);
			break;
		}
	}

}
