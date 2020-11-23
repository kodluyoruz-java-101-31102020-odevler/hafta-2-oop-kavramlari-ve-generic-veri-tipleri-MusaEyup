package com.odev2.soru3.mukerrersayilar;

public class RepeatItemCounter {
	
	public static <N> int countRepeatedItems(N[] array, N item) {
		int counter = 0;
		
		if (item == null) {
			for(N element : array) 
				if (element == item) counter++;
			 
		}
		else {
			for (N element : array) 
				if(item.equals(element)) 
					counter++;

		}
		
		return counter;
	}

}
