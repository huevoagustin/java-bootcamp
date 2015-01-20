package com.playlist;

import java.util.Scanner;

public class Stop implements PlayerState{

	
	public void execute(AudioPlayer aPlayer) {
		System.out.println(" Stop!");
		aPlayer.setState(this);
		System.out.println("<(p)lay>");
		Scanner in = new Scanner(System.in);
		String action;
		action = in.next();
		switch (action){
		case "p": 
			PlayerState play = new Play();
			play.execute(aPlayer); break;
		}
	}

}
