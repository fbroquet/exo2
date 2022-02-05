package com.tetras.librarie;

public class FlorizarreMegaEvoluale extends Florizarre implements IMegaEvoluable{
    
    @Override
    public MegaPokemon evoluer() {
        return new MegaFlorizarre();
    }
}
