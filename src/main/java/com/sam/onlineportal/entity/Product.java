package com.sam.onlineportal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String code;
	private String name;
	private Double cost;
	private Category category;
	
	@Id
	@Column(name="Code")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Column(name="Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="Cost")
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Enumerated(EnumType.ORDINAL)
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
