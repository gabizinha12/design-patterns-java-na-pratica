package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new 	IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		IPhoneFactory iphone11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.createIPhone();
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = iphone11ProFactory.createIPhone();
		System.out.println(iPhone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iPhone3 = iphone11Factory.createIPhone();
		System.out.println(iPhone3);

	}
}
