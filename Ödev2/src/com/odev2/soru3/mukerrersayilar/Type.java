package com.odev2.soru3.mukerrersayilar;

public class Type {
	
	public static<N> String getType(N[] array) {
		
		
		Class<? extends Object[]> c = array.getClass();
		String type = c.getTypeName();
		
		return type;
	}
}
