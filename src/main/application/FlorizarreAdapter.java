package application;

import application.Librairie.*;

//Utilisation du pattern Adapter
public class FlorizarreAdapter extends Florizarre implements IMegaEvoluable{
    
    @Override
    public MegaPokemon evoluer() {
        return new MegaFlorizarre();
    }
}
