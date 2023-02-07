package design.boilerplate.springboot.repository;

import design.boilerplate.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on February 2023
 *
 * @author Kangyasin
 */
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

	boolean existsByEmail(String email);

	boolean existsByUsername(String username);

}
