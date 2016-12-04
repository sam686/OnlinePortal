package com.sam.onlineportal.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.sam.onlineportal.bo.Cart;
import com.sam.onlineportal.bo.CartItem;
import com.sam.onlineportal.dao.OrderDao;
import com.sam.onlineportal.entity.Order;
import com.sam.onlineportal.entity.OrderDetail;
import com.sam.onlineportal.service.OrderService;

@Service("OrderService")
public class OrderServiceImpl implements OrderService  {
	
	@Resource
	private OrderDao orderDao;
	
	public Order createOrder(Cart cart)
	{
		
		Order order= new Order();
		order.setAmount(cart.getTotalAmount());
		order.setTax(cart.getTotalTax());
		for(CartItem cartElement : cart.getCartItems())
		{
			OrderDetail od= new OrderDetail();
			od.setProduct(cartElement.getProduct());
			od.setQuantity(cartElement.getQuantity());
			od.setPrice(cartElement.getProduct().getCost());
			od.setAmount(cartElement.getAmount());
			od.setOrder(order);
			order.getOrderDetails().add(od);
		}
		order=orderDao.createOrder(order);
		return order;
	}
}
