package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {

   public IPhone createIPhone(String level) {
    IPhone device = null;
    device = createIPhone(level);
    device.getHardware();
    device.assemble();
    device.certificates();
    device.pack();
    return device;
   }

   public abstract IPhone orderIPhone(String level);

 
	
}
