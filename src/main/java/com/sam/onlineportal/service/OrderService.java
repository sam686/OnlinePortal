package com.sam.onlineportal.service;

import com.sam.onlineportal.bo.Cart;
import com.sam.onlineportal.entity.Order;

public interface OrderService {
	
	public Order createOrder(Cart cart);
}
