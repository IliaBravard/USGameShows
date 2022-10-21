package shows.controller; // The package where this configuration class is located at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

//Including the needed imports
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Allows access to the specified entities
import shows.beans.Game;
import shows.beans.Host;

@Configuration // Used to mark a bean to be configured by the Spring IOC
public class BeanConfiguration {
	@Bean // Tells the Spring context that the method returns a bean that will later be
			// managed

	/**
	 * This method returns a game bean that is injected using a setter dependency
	 * injection.
	 * 
	 * @return the game bean
	 */
	public Game gameShow() {
		Game bean = new Game();
		bean.setShowName("Who Wants to Be a Millionaire");
		bean.setEpisodeDuration(45);
		bean.setMaxPrize(1000000.00);
		bean.setRunning(false);
		return bean;
	}

	/**
	 * This method returns a host bean that is autowired by its type.
	 * 
	 * @return the host bean
	 */
	@Bean
	public Host host() {
		Host bean = new Host("Regis", "Philbin");
		return bean;
	}

}
