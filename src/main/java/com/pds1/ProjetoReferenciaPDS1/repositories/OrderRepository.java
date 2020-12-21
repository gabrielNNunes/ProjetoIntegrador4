package com.pds1.ProjetoReferenciaPDS1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pds1.ProjetoReferenciaPDS1.entities.Order;
import com.pds1.ProjetoReferenciaPDS1.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	List<Order> findByClient(User client);
}
