package de.muellerd.model;

/**
 * This class represents a single player. A player has a name in order to identify him. 
 * There is also a reference to {@link SessionStatistics} and {@link TotalStatistics}.
 * SessionStatistics are used to store the results of one session, where one session is the time
 * from the start of the app until it is closed.
 * While SessionStatistics only records for one single session, TotalStatistics aggregates all SessionStatistics.
 * Players are relevant for games. In order to start a new game, players have to be assigned to the game.
 * 
 * @author Daniel Müller, 2014
 *
 */
public class Player {

	/**
	 * The name of the player
	 */
	private String name;
	
	/**
	 * The statistics object for one session. A session is the time from the start of the app until the app is closed.
	 */
	private SessionStatistics statistics;
	
	/**
	 * Initializes a new instance of the object {@link Player}.
	 */
	public Player(){
		name = "";
	}
	
	/**
	 * Initializes a new instance of the object {@link Player}.
	 * 
	 * @param n the name of the player
	 */
	public Player(String n){
		name = n;
	}
	
	
}
