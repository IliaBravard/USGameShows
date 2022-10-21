package shows; // The package where this application class is located at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

//Including the needed imports
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

// Allows access to the specified classes
import shows.beans.Game;
import shows.beans.Host;
import shows.controller.BeanConfiguration;
import shows.repository.GameRepository;

@SpringBootApplication // Allows for auto-configuration, component scan, etc.

/**
 * This is the Spring Container instance that implements the CommandLineRunner
 * interface.
 */
public class USGameShowsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(USGameShowsApplication.class, args);
	}

	@Autowired // Singleton by default
	GameRepository repository;

	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		// Instantiating a bean for JPA persistence
		Host h = new Host("Rigis", "Philbin");
		Game g = new Game("Who Wants To Be a Millionaire", 45, 1000000, false);
		g.setGameHost(h);
		repository.save(g); // Saving the record

		List<Game> allGameShows = repository.findAll();

		/* Traversing the list and displaying the objects - Diagnostic */
		for (Game game : allGameShows) {
			System.out.println(game.toString());
		}

		// Closing the application resource leak for security
		((AbstractApplicationContext) appContext).close();
	}
}