package com.playlist;

import java.util.Scanner;

public class Pause implements PlayerState{

	
	public void execute(AudioPlayer aPlayer) {
		System.out.println(" || Pause.");
		aPlayer.setState(this);
		System.out.println("<(p)lay/(s)top>");
		Scanner in = new Scanner(System.in);
		String action;
		action = in.next();
		switch (action){
		case "p": 
			PlayerState play = new Play();
			play.execute(aPlayer);
			break;
		case "s":
			PlayerState stop = new Stop();
			stop.execute(aPlayer);
			break;
		}
		
	}

}
