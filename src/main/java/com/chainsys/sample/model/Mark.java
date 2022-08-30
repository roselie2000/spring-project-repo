package com.chainsys.sample.model;

public class Mark {

	private int mark1, mark2, mark3;
	
	
	Mark(int mark1, int mark2, int mark3){
		super();
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	public String toString(){
		return mark1+" "+mark2+" "+mark3;
	}
	
//	private String addressLine1,city,state,country;
//
//	public Mark(String addressLine1, String city, String state, String country) {
//		super();
//		this.addressLine1 = addressLine1;
//		this.city = city;
//		this.state = state;
//		this.country = country;
//	}
//	public String toString(){
//		return addressLine1+" "+city+" "+state+" "+country;
//	}

}
