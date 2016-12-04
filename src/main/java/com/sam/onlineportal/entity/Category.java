package com.sam.onlineportal.entity;

public enum Category {
	
	A(1){
		public Double getTaxRate()
		{
			return 5.0;
		}
	},B(2){
		public Double getTaxRate()
		{
			return 10.0;
		}
	},C(3){
		public Double getTaxRate()
		{
			return 0.0;
		}
	};
	private Integer catCode;
	
	Category(int catCode)
	{
		this.catCode=catCode;
	}
	
	public Integer getCatCode() {
		return catCode;
	}

	public abstract Double getTaxRate();

}
