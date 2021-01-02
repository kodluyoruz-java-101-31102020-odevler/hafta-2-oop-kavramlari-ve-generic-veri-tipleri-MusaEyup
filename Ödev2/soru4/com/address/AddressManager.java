package com.address;

import java.util.ArrayList;

import com.user.User;

public class AddressManager {
	
	public static void addAddress(User user , Address address) {
		
		if (user.getAddress() == null)
			user.setAddress(new ArrayList<>());
		
		user.getAddress().add(address);
	}
	
	public static void removeAddress(User user, Address address) {
		
		user.getAddress().remove(address);
	}
}
