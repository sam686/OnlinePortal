package com.sam.onlineportal.dao.impl;

import org.springframework.stereotype.Repository;

import com.sam.onlineportal.dao.OrderDao;
import com.sam.onlineportal.entity.Order;

@Repository("OrderDao")
public class OrderDaoImpl implements OrderDao{
	
	public Order createOrder(Order order)
	{
		System.out.println(order.toString());
		return null;
	}
}
