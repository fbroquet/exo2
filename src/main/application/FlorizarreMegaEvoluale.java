package application;

import application.Librairie.*;
public class FlorizarreMegaEvoluale extends Florizarre implements IMegaEvoluable{
    
    @Override
    public MegaPokemon evoluer() {
        return new MegaFlorizarre();
    }
}
