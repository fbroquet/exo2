package application;
import java.util.List;

import application.Librairie.*;
import java.util.ArrayList;


//Utilisation  du pattern Decorator
public class PokemonObscurDecorator implements IObscurDecorator{
    
    private Pokemon PokemonClassique;


    public PokemonObscurDecorator(Pokemon PokemonInitial){
        PokemonClassique = PokemonInitial;
    }

    public List<Type> getTypes() {
        return TypesObsur(PokemonClassique.getTypes());
    }

    private List<Type> TypesObsur(List<Type> TypesInitials){
        List<Type> TypeTemp = new ArrayList<>();
        TypeTemp.addAll(TypesInitials);
        if(TypeTemp.size()>1){ //Suppression du 1er type si Il Y en a au moins 2.
            TypeTemp.remove(0);
        }
        return TypeTemp;
    }

    @Override
    public Pokemon purifier() {
        
        return PokemonClassique;
    }

}

