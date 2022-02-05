package application;

import application.Librairie.*;
import java.util.Arrays;

public class MegaFlorizarre extends MegaPokemon {

    public MegaFlorizarre() {
        super(Arrays.asList(Type.Plante, Type.Poison));
    }
}