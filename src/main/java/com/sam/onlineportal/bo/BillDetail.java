package com.sam.onlineportal.bo;

import java.io.Serializable;

public class BillDetail implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Double amount;
	private Double price;
	private Integer quantity;
	private ProductInfo product;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public ProductInfo getProduct() {
		return product;
	}
	public void setProduct(ProductInfo product) {
		this.product = product;
	}
	
}
