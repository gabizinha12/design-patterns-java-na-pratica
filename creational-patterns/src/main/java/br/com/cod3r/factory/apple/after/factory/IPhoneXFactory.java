package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.IPhoneX;
import br.com.cod3r.factory.apple.after.model.IPhone;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhone createIPhone() {
        return new IPhoneX();
    }

}