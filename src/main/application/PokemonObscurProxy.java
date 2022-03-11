package application;
import java.util.List;

import application.Librairie.*;
import java.util.ArrayList;

//Pattern Proxy
public class PokemonObscurProxy extends Pokemon {

    private Pokemon PokemonClassique;

    public PokemonObscurProxy(Pokemon Pokemon) {
        super(TypesObsur(Pokemon.getTypes()));
        this.PokemonClassique = Pokemon; 
    }


    public Pokemon purifier(){
        return PokemonClassique;
    }

    private static List<Type> TypesObsur(List<Type> TypesInitials){
        List<Type> TypeTemp = new ArrayList<>();
        TypeTemp.addAll(TypesInitials);
        if(TypeTemp.size()>1){ //Suppression du 1er type si Il Y en a au moins 2.
            TypeTemp.remove(0);
        }
        return TypeTemp;
    }
    
}
