package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;

public abstract class IPhoneFactory {

   public IPhone createIPhone() {
    IPhone device = null;
    device = createIPhone();
    device.getHardware();
    device.assemble();
    device.certificates();
    device.pack();
    return device;
   }

 
	
}
