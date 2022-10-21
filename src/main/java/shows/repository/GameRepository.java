package shows.repository; // The package where this repository class is located at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

// Including the needed imports
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Allows access to the specified class
import shows.beans.Game;

@Repository // Indicates that the underlying interface is a repository
public interface GameRepository extends JpaRepository<Game, Long> {
}