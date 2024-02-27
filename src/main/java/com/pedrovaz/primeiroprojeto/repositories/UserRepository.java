package com.pedrovaz.primeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrovaz.primeiroprojeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
