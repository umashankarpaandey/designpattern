package com.facade.pattern;

public class Iphone implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("Iphone 6");
		
	}

	@Override
	public void  price() {
		System.out.println("45000");
		
	}
	

}
