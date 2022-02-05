package com.tetras.librarie;

import java.util.Arrays;

public class Bulbizarre extends Pokemon implements IEvoluable {

    public Bulbizarre() {
        super(Arrays.asList(Type.Plante, Type.Poison));
    }

    @Override
    public Pokemon evoluer() {
        return new Herbizarre();
    }

}