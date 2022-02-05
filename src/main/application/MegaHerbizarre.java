package application;

import application.Librairie.*;
import java.util.Arrays;

public class MegaHerbizarre extends MegaPokemon {

    public MegaHerbizarre() {
        super(Arrays.asList(Type.Plante, Type.Poison));
    }
}