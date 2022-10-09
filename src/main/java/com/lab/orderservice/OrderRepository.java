package com.lab.orderservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.orderservice.enitity.Order1;

public interface OrderRepository extends JpaRepository<Order1, Integer>{
	
}
