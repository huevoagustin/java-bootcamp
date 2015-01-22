package com.playlist;
/**
 * Possible actions for our playlist
 *
 */
// State
public interface PlayerState {
	/**
	  * Start playing the playlist. The user can listen music after this action.
	  * 
	  * @param currentState
	  *            {@link Context} Current playlist state
	  */
	public void play(AudioPlayer context);
	/**
	  * Pause the playlist. The user stop listing the music, but he can restart
	  * it if he wants from same instant he pause it.
	  * 
	  * @param currentState
	  *            {@link Context} Current playlist state
	  */
	public void pause(AudioPlayer context);
	/**
	  * Stop the playlist. The user stop listing the music. The user will start
	  * listening the same song from the beginning if he plays the playlist
	  * again.
	  * 
	  * @param currentState
	  *            {@link Context} Current playlist state
	  */
	public void stop(AudioPlayer context);

}


