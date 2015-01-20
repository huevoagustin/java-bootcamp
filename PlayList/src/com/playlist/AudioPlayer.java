package com.playlist;

public class AudioPlayer {
	
	private PlayerState pState;
	
	public AudioPlayer(){
		pState = null;
	}
	
	public void setState(PlayerState pState){
		this.pState = pState;
	}
	
	public PlayerState getState(){
		return pState;
	}

}
