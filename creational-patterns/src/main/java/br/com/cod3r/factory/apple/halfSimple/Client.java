package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		IPhone11Factory iPhone11Factory = new IPhone11Factory();
		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
		

		IPhone iphoneX = iPhoneXFactory.orderIPhone("standard");
		System.out.println("### Ordering an iPhone X");
		System.out.println(iphoneX);
		
		IPhone iphone11 = iPhone11Factory.orderIPhone("highEnd");
		System.out.println("\n\n### Ordering an iPhone 11");
		System.out.println(iphone11);
		
	}
}
