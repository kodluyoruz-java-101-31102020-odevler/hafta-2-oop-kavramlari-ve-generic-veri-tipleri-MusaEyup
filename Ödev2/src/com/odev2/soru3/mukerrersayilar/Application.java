package com.odev2.soru3.mukerrersayilar;

import java.util.HashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		// Integer
		Arrays<Integer> intArray = new Arrays<Integer>(Integer.class, 10);
		intArray.fill(); // rastgele doldur
		Printer.print(intArray.getArray()); // ekrana yazdýr
		Set<Integer> repeatedNumbers = new HashSet<Integer>(); 
		findRepeated(repeatedNumbers, intArray);
		
		
		// Double
		Arrays<Double> doubleArray = new Arrays<Double>(Double.class, 10);
		doubleArray.fill();
		Printer.print(doubleArray.getArray());
		Set<Double> repeatedDoubleNumbers = new HashSet<Double>(10);
		findRepeated(repeatedDoubleNumbers, doubleArray);
		
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static<N> void findRepeated(Set<N> rNumbers, Arrays array) {
		
		for(Number i : array.getArray()) {
			int count = RepeatItemCounter.countRepeatedItems(array.getArray(), i);
			if (count > 1 )
				rNumbers.add((N) i);
		}
		
		for (N repeated : rNumbers) {
			System.out.print(repeated + " ");
		}
		
		System.out.println();
		
	}

}
