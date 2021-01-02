package com.insurance;

import java.util.Date;

public abstract class  Insurance {
	
	private String name;
	private double price;
	private Date startDate;
	private Date endDate;
	
	abstract double culculate();
	
	

}
