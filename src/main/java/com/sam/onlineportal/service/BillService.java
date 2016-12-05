package com.sam.onlineportal.service;

import com.sam.onlineportal.bo.Bill;
import com.sam.onlineportal.bo.Cart;

public interface BillService {
	
	public Bill generateBill(Cart cart);
}
