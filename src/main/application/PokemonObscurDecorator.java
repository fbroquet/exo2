package application;

import application.Librairie.*;
import java.util.List;
import java.util.ArrayList;

public class PokemonObscurDecorator{
    
    public Pokemon pokemon;
    private List<Type> types;

    public PokemonObscurDecorator(Pokemon pokePur){
            List<Type> TypesPokeOld = new ArrayList<>();
            TypesPokeOld.addAll(pokePur.getTypes());
            System.out.println(TypesPokeOld.get(1));
            if(TypesPokeOld.size()>=1){
                TypesPokeOld.remove(0);
                types = TypesPokeOld;
            }
    }

    public List<Type> getTypes() {
        return types;
    }


    public Pokemon purifier(){
            return pokemon;
    }
}

