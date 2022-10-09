package com.lab.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.orderservice.OrderRepository;
import com.lab.orderservice.enitity.Order1;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	public void saveOrder(Order1 order) {
		log.debug("adding item into db");
		orderRepository.save(order);
	}
}
