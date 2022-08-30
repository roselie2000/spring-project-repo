package com.chainsys.sample.designpattern;

public class FrontControllerImpl {

	public static void main(String[] args) {
		   
	      FrontController frontController = new FrontController();
	      frontController.dispatchRequest("Admin");
	      frontController.dispatchRequest("User");
	   }
}
