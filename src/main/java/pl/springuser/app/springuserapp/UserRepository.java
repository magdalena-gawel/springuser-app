package pl.springuser.app.springuserapp;

import org.springframework.data.repository.CrudRepository;

import pl.springuser.app.springuserapp.User;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

}