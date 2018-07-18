package com.facade.pattern;

public class ShopKeeper  {
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackBerry;
	
	public ShopKeeper(){
		iphone=new Iphone();
		samsung=new Samsung();
		blackBerry=new BalckBerry();
	}
	public void iphoneSale(){
		iphone.modelNo();
		iphone.price();
	}
	public void samsungSale(){
		samsung.modelNo();
		samsung.price();
	}
	public void blackBerrySale(){
		blackBerry.modelNo();
		blackBerry.price();
	}
	
	



}
