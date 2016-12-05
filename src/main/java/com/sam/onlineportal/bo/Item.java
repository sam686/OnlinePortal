package com.sam.onlineportal.bo;

import com.sam.onlineportal.entity.Product;

public class Item {
	
	private Product product;
	private Integer quantity;
		
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public  Double getAmount()
	{
		return product.getCost()*quantity;
	}
	public  Double getTax()
	{
		return product.getCategory().getTaxRate()*quantity;
	}
}
