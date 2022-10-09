package com.lab.orderservice.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Order1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	private String item;
	private int price;
}
