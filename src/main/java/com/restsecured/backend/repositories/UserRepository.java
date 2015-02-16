package com.restsecured.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restsecured.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
