package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {

	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhone11Factory gen11Factory = new IPhone11Factory(rules);
		IPhoneXFactory genXFactory = new IPhoneXFactory(rules);

		System.out.println("### Ordering an IPhone11");
		IPhone iphone = gen11Factory.orderIPhone("standard");
		System.out.println(iphone);
		System.out.println("### Ordering an IPhoneX");
		IPhone iphoneX = genXFactory.orderIPhone("highEnd");
		System.out.println(iphoneX);

	}
}
