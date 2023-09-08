package com.usermanagement.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usermanagement.entities.User;
import com.usermanagement.model.UserForm;

public interface UserRepository extends JpaRepository<User, Long>{
	
	 Optional<User> findByEmail(String email);

	User findByFirstName(String firstName);

}
