package application;

import application.Librairie.*;
import java.util.List;
import java.util.ArrayList;


//Utilisation  du pattern Decorator
public class PokemonObscur extends Pokemon{
    
    private Pokemon PokemonClassique;
    private List<Type> types;

    public PokemonObscur(Pokemon PokemonInitial){
        super(PokemonInitial.getTypes());
        this.PokemonClassique = PokemonInitial;
        List<Type> TypesInitial = new ArrayList<>();
        TypesInitial.addAll(PokemonInitial.getTypes());
        if(TypesInitial.size()>1){ //Suppression du 1er type si Il Y en a au moins 2.
            TypesInitial.remove(0);
        }
        this.types =TypesInitial;
    }

    @Override
    public List<Type> getTypes() {
        return types;
    }

    public Pokemon purifier(){
         return PokemonClassique;
    }
}

