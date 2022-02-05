package application;

import application.Librairie.*;

//Utilisation du pattern Adaptor
public class FlorizarreAdaptor extends Florizarre implements IMegaEvoluable{
    
    @Override
    public MegaPokemon evoluer() {
        return new MegaFlorizarre();
    }
}
