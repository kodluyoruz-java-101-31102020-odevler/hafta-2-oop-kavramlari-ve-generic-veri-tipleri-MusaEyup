package com.odev2.soru3.mukerrersayilar;

public class Printer {
	
	public static<N extends Number> void print(N[] array) {
		String type = Type.getType(array);
		
		if(type.endsWith("Double[]") || type.endsWith("Float")) {
			
			for (N element : array) {
				System.out.print(String.format("%.2f  ", element));
			}
		}
		else  {
			for( N element : array ) {
				System.out.print(element + "  ");
			}
		}
		
		System.out.println();
	}

}
