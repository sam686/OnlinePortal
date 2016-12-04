package com.sam.onlineportal.bo;


import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private Double totalAmount;
	private Double totalTax;
	private List<CartItem> cartItems = new ArrayList<CartItem>();

	
	public Double getTotalTax() {
		for(CartItem item:cartItems)
		{
			totalTax=totalTax+item.getTax();
		}
		
		return totalTax;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public Double getTotalAmount() {
		for(CartItem item:cartItems)
		{
			totalAmount=totalAmount+item.getAmount();
		}
		return totalAmount;
	}

	public Double getGrossTotal() {
		return (getTotalAmount()+getTotalTax());
	}
	public boolean isEmpty()
	{
		return cartItems.isEmpty();
	}
}
