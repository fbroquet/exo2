package application.Librairie;

import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon {
    private List<Type> types = new ArrayList<>();

    public Pokemon(List<Type> types) {
        this.types = types;
    }

    public List<Type> getTypes() {
        return types;
    }

    

}