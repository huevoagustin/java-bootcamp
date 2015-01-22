package com.playlist;

// context
public class AudioPlayer {
	
	private PlayerState pState;
	
	public AudioPlayer(){
		this.pState = new Stop();
	}
	
	public void setState(PlayerState pState){
		this.pState = pState;
	}
	
	public PlayerState getState(){
		return pState;
	}

	
}
