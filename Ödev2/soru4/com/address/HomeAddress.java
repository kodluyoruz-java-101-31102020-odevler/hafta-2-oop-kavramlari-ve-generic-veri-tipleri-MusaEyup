package com.address;

public class HomeAddress implements Address{
	
	private String homeAddress;


	public HomeAddress(String address) {
		this.homeAddress = address;
	}


	@Override
	public String getAddress() {
		
		return this.homeAddress;
	}


	@Override
	public void setAddress(String address) {
		
		this.homeAddress = address;
		
	}







	
	
	

}
