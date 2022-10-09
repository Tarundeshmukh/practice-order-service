package com.lab.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lab.orderservice.enitity.Order1;
import com.lab.orderservice.service.OrderService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	
	public void saveOrder(@RequestBody Order1 order) {
		orderService.saveOrder(order);
		log.debug("Item: " +order.getItem());
	}
}
