package com.sam.onlineportal.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sam.onlineportal.bo.Bill;
import com.sam.onlineportal.bo.Cart;
import com.sam.onlineportal.service.BillService;


@RestController
public class PortalRestController {
	
	@Resource
	BillService billService;
	
	@PostMapping(value = "/checkout", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bill> createCustomer(@RequestBody Cart cart) {
		
		if(cart.isEmpty())
		{
			return new ResponseEntity<Bill> (HttpStatus.BAD_REQUEST);
		}
		Bill bill = billService.generateBill(cart);

		return new ResponseEntity<Bill>(bill, HttpStatus.OK);
	}

}
