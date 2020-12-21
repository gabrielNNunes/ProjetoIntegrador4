package com.pds1.ProjetoReferenciaPDS1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pds1.ProjetoReferenciaPDS1.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
