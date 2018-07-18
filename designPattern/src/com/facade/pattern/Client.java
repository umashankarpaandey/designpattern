package com.facade.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.attribute.standard.Chromaticity;
import javax.xml.stream.util.StreamReaderDelegate;

public class Client {
	public static int choice;

	public static void main(String[] args) throws NumberFormatException,IOException {
	do {
		System.out.println("========Mobile Shop============");
		System.out.println("    1.IPhone        ");
		System.out.println("    2.Samsung       ");
		System.out.println("    3.BlackBerry    ");
		System.out.println("    4.Exit          ");
		System.out.println("Enter your choice:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		choice=Integer.parseInt(br.readLine());
		ShopKeeper sk= new ShopKeeper();
		
	switch(choice){
	case 1:
	{
	sk.blackBerrySale();
	}
	break;
	case 2:
	{
		sk.iphoneSale();
	}
	break;
	case 3:{
		sk.samsungSale();
	}
	break;
	default:
	{
		System.out.println("nothing purchached");
	}
	return;
	}
		
	} while (choice!=4);	
	

	}

}

