package de.muellerd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * This class represents the Game objects. A game consists of a list of players, who take part in 
 * the game. 
 * This class is just a basic frame in order to create different types of games, which then have to extend
 * this class.
 * There are also two {@link HashMap}, which store tuples of {@link Player} and {@link SessionStatistics} and also 
 * Player and {@link GameSessionStatistics}. SessionData objects store everything, which occurs in one session, while
 * GameSessionStatistics only stores everything of a single game.
 *  
 * 
 * @author Daniel Müller, 2014
 *
 */
abstract public class Game {
	
	/**
	 * The date of the creation of the game.
	 */
	private Date creationDate;
	
	/**
	 * The list of players, who will participate in the game. This list is sorted according to the sequence of the players.
	 */
	private ArrayList<Player> players;
	
	/**
	 * This {@link HashMap} stores {@link SessionStatistics} and their assignment to {@link Player}.
	 */
	private HashMap<Player, SessionStatistics> playerToStatisticsMap;
	
	/**
	 * This {@link HashMap} stores {@link GameSessionStatistics} and their assignment to {@link Player}.
	 */
	private HashMap<Player, GameSessionStatistics> playerToGameStatisticsMap;
	
	/**
	 * Initializes a new instance of the {@link Game} class.
	 * 
	 * @param creation the date of the creation of this game
	 */
	public Game(Date creation){
		creationDate = creation;
	}
	
	/**
	 * Initializes a new instance of the {@link Game} class.
	 * 
	 * @param creation the date of the creation of this game
	 * @param ps the sorted list of players
	 */
	public Game(Date creation, ArrayList<Player> ps){
		creationDate = creation;
		players = ps;
	}

}
