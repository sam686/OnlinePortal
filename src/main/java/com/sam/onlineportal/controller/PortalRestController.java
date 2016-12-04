package com.sam.onlineportal.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sam.onlineportal.bo.Cart;
import com.sam.onlineportal.entity.Order;
import com.sam.onlineportal.service.OrderService;

@RestController
public class PortalRestController {
	
	@Resource
	OrderService orderService;
	
	@PostMapping(value = "/orders", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> createCustomer(@RequestBody Cart cart) {
		
		if(cart.isEmpty())
		{
			return new ResponseEntity<Order> (HttpStatus.BAD_REQUEST);
		}
		Order order = orderService.createOrder(cart);

		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}

}
