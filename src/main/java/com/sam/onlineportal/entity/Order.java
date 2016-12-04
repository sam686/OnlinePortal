package com.sam.onlineportal.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Double amount;
	private Double tax;
	private Timestamp order_date;
	private List<OrderDetail> orderDetails=new ArrayList<OrderDetail>();
	
	@Id
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
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Timestamp getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Timestamp order_date) {
		this.order_date = order_date;
	}
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
