package com.tetras.librarie;

public class HerbizarreMegaEvoluale extends Herbizarre implements IMegaEvoluable{
    
    @Override
    public MegaPokemon evoluer() {
        return new MegaHerbizarre();
    }
}
