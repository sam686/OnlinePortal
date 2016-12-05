package com.sam.onlineportal.service.impl;

import org.springframework.stereotype.Service;
import com.sam.onlineportal.bo.Bill;
import com.sam.onlineportal.bo.BillDetail;
import com.sam.onlineportal.bo.Cart;
import com.sam.onlineportal.bo.Item;
import com.sam.onlineportal.bo.ProductInfo;
import com.sam.onlineportal.service.BillService;


@Service("BillService")
public class BillServiceImpl implements BillService  {
	
	
	public Bill generateBill(Cart cart)
	{
		
		Bill bill= new Bill();
		bill.setAmount(cart.getTotalAmount());
		bill.setTax(cart.getTotalTax());
		for(Item cartElement : cart.getCartItems())
		{
			BillDetail od= new BillDetail();
			ProductInfo productInfo = new ProductInfo();
			productInfo.setCost(cartElement.getProduct().getCost());
			productInfo.setName(cartElement.getProduct().getName());
			od.setProduct(productInfo);
			od.setQuantity(cartElement.getQuantity());
			od.setPrice(cartElement.getProduct().getCost());
			od.setAmount(cartElement.getAmount());
			bill.getOrderDetails().add(od);
		}
		return bill;
	}
}
