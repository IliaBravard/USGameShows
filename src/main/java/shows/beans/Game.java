package shows.beans; // The package where this bean class is located at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

// Including the needed imports
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * This is the object to be used by the IOC, otherwise known as the bean for
 * this app.
 */

@Entity
@Table(name = "shows")
public class Game {

	@Id
	@GeneratedValue
	@Column(name = "SHOW_ID")
	private long id; // The show's id number
	
	@Column(name = "SHOW_NAME")
	private String showName; // The name of the show
	
	@Column(name = "AVG_EPISODE_TIME")
	private int episodeDuration; // The mean duration of each episode (in minutes)
	
	@Column(name = "MAX_PRIZE")
	private double maxPrize; // The maximum prize that can be won
	
	@Column(name = "STILL_RUNNING")
	private boolean isRunning; // Whether the show is still running or not
	
	// Autowiring the bean dependency by using the type of the field
	@Autowired
	@Column(name = "HOST")
	private Host gameHost;

	/**
	 * This is the default, no argument constructor.
	 */
	public Game() {
	}

	/**
	 * This is the nondefault constrcutor that sets all fields of this class/entity.
	 * 
	 * @param name     - the game show's name
	 * @param duration - the average episode duration of each episode (in minutes)
	 * @param maxPrize - the maximum prize that can be won
	 * @param running - whether the show is still running or nott
	 */
	public Game(String name, int duration, double maxPrize, boolean running) {
		setShowName(name);
		setEpisodeDuration(duration);
		setMaxPrize(maxPrize);
	}

	// Generating the needed accessort and mutators for this class
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public int getEpisodeDuration() {
		return episodeDuration;
	}

	public void setEpisodeDuration(int episodeDuration) {
		this.episodeDuration = episodeDuration;
	}

	public double getMaxPrize() {
		return maxPrize;
	}

	public void setMaxPrize(double maxPrize) {
		this.maxPrize = maxPrize;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public Host getGameHost() {
		return gameHost;
	}

	public void setGameHost(Host gameHost) {
		this.gameHost = gameHost;
	}

	/**
	 * This method prints the value details for each field used in this
	 * class/entity, if any.
	 * 
	 * @return a string line showcasing the values of each field
	 */
	@Override
	public String toString() {
		return "Game --> [ID: " + id + "| Name:  " + showName + "| Episode Duration: " + episodeDuration + "| Max Prize: $"
				+ maxPrize + "| Is It On Today: " + isRunning + "\n          " + gameHost + "]";
	}
}
