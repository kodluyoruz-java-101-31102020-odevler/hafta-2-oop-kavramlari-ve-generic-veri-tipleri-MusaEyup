package com.odev2.soru3.mukerrersayilar;

import java.lang.reflect.Array;

public class Arrays <N extends Number>{
	
	private int size;
	private N[] array;
	
	
	@SuppressWarnings("unchecked")
	public Arrays(Class<N> dataType, int size) {
		
		this.size = size;
		this.array = (N[]) Array.newInstance(dataType, size);
		
	}
	
	public N[] getArray() {
		return array;
	}
	public void setArray(N[] array) {
		this.array = array;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void fill() {
		
		String type = Type.getType(this.array);
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = generateRandomNumber(type);
			
		}
	}
	
	@SuppressWarnings("unchecked")
	private N generateRandomNumber(String type) {
		
		if (type.endsWith("Integer[]")) {
			Integer randomInteger = (int) (Math.random() * 10);
			return (N) randomInteger;	
		}
		
		else if(type.endsWith("Long[]")) {
			Long randomLong = (long) (Math.random() * 10);
			return (N) randomLong;
		}
		else if(type.endsWith("Double[]")) {
			Double randomDouble = (double) (Math.random() * 10);
			return (N) randomDouble;
		}
		else  {
			Float randomFloat = (float) (Math.random() * 10);
			return (N) randomFloat;
		}
		
		
	}
	

}
