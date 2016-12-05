package com.sam.onlineportal.bo;


import java.util.ArrayList;
import java.util.List;

public class Bill {
	
	private Double amount;
	private Double tax;
	private List<BillDetail> orderDetails=new ArrayList<BillDetail>();
	
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
	public List<BillDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<BillDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
