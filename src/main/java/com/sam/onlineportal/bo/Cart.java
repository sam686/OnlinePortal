package com.sam.onlineportal.bo;


import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private Double totalAmount;
	private Double totalTax;
	private List<Item> cartItems = new ArrayList<Item>();

	
	public Double getTotalTax() {
		for(Item item:cartItems)
		{
			totalTax=totalTax+item.getTax();
		}
		
		return totalTax;
	}

	public List<Item> getCartItems() {
		return cartItems;
	}

	public Double getTotalAmount() {
		for(Item item:cartItems)
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
