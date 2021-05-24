package com.fipe.desafio.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fipe.desafio.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findById(Long id);

}
