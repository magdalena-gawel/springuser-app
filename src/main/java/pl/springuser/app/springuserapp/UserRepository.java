package pl.springuser.app.springuserapp;

import org.springframework.data.repository.CrudRepository;

import pl.springuser.app.springuserapp.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}