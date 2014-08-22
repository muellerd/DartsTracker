package de.muellerd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * This class represents a specific type of {@link Game}, which can be played. 
 * In this game a {@link Player} starts with an initial number of points and the
 * player has to try to lower them with each throw until the player reaches
 * zero points. The first player, who reaches zero points, wins the game.
 * Zero points can only be achieved if the player throws exactly the number of points
 * which are still left behind. If the player throws too much points, his throws won't count
 * and the player has to try again with the next turn.
 * 
 * @author Daniel Müller, 2014
 *
 */
public class CountdownGame extends Game{

	/**
	 * Number of initial points at the beginning of the {@link Game}. Typical starting sizes are 301, 501, 701, 901 points.
	 */
	private int initialPoints;
	
	/**
	 * This {@link HashMap} combines a {@link Player} with the number of points, which are still left behind for him/her.
	 */
	private HashMap<Player, Integer> playerToRestPoints;
	
	/**
	 * Initializes a new instance of the {@link CountdownGame}.
	 * 
	 * @param creation the creation date of this game
	 * @param initPoints the initial number of points, with which each player starts
	 */
	public CountdownGame(Date creation, int initPoints){
		super(creation);
		this.initialPoints = initPoints;
	}
	
	/**
	 * Initializes a new instance of the {@link CountdownGame}.
	 * 
	 * @param creation the creation date of this game
	 * @param ps the sorted list of players
	 * @param initPoints the initial number of points, with which each player starts
	 */
	public CountdownGame(Date creation, ArrayList<Player> ps, int initPoints){
		super(creation, ps);
		this.initialPoints = initPoints;
	}
}
