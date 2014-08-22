package de.muellerd.model;

import java.util.ArrayList;

/**
 * This class will be used to store the {@link ArrayList} of {@link Player} objects.
 * 
 * @author Daniel Müller, 2014
 *
 */
public class PlayerList {
	
	/**
	 * The {@link ArrayList} of {@link Player} objects. 
	 */
	private ArrayList<Player> players;

	
	/**
	 * Initializes a new instance of the {@link PlayerList} class.
	 */
	public PlayerList(){
		players = new ArrayList<Player>();
	}
	
	/**
	 * Initializes a new instance of the {@link PlayerList} class.
	 * 
	 * @param pls the list of players
	 */
	public PlayerList(ArrayList<Player> pls){
		players = pls;
	}
}
