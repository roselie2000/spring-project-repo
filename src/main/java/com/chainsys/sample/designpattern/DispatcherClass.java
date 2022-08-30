package com.chainsys.sample.designpattern;

public class DispatcherClass {

	private AdminView adView;
	private UserView usview;
	   
	   public DispatcherClass(){
		   adView = new AdminView();
		   usview = new UserView();
	   }

	   public void dispatch(String request){
	      if(request.equalsIgnoreCase("STUDENT")){
	         usview.show();
	      }
	      else{
	    	  adView.show();
	      }	
	   }
}
