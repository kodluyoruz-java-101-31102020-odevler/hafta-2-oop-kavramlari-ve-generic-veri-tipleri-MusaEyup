package com.address;

public class BusinessAddress implements Address{
	
	private String businessAddress;
	
	


	public BusinessAddress(String addrsess) {
		this.businessAddress = addrsess;
	}


	@Override
	public String getAddress() {
		
		return this.businessAddress;
	}

	@Override
	public void setAddress(String address) {
		
		this.businessAddress = address;
	}






	
	

}
