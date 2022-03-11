package application;

import application.Librairie.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.util.List;

public class PokemonTest {

    @Test
    public void EvolutionBulbizarre() {
        Bulbizarre PokemonInitial = new Bulbizarre(); 
        Pokemon EvolutionPokemon = PokemonInitial.evoluer();
        assertTrue(EvolutionPokemon instanceof Herbizarre);
        assertTrue(EvolutionPokemon instanceof Pokemon);
    }


    @Test
    public void EvolutionHerbizarre() {
        Herbizarre PokemonInitial = new Herbizarre(); 
        Pokemon EvolutionPokemon = PokemonInitial.evoluer();
        assertTrue(EvolutionPokemon instanceof Florizarre);
        assertTrue(EvolutionPokemon instanceof Pokemon);
    }


    @Test
    public void EvolutionFlorizzarreMegaPokemon() {
        FlorizarreAdapter PokemonInitial = new FlorizarreAdapter(); 
        Pokemon EvolutionPokemon = PokemonInitial.evoluer();
        assertTrue(EvolutionPokemon instanceof MegaPokemon);
    }

    @Test
    public void TestTypes() {
        //bulbizarre
        Bulbizarre bulbizarre = new Bulbizarre(); 
        assertEquals(2, bulbizarre.getTypes().size());
        assertEquals(Type.Plante, bulbizarre.getTypes().get(0));
        assertEquals(Type.Poison, bulbizarre.getTypes().get(1));

        //herbizarre
        Herbizarre herbizarre = new Herbizarre(); 
        assertEquals(2, herbizarre.getTypes().size());
        assertEquals(Type.Plante, herbizarre.getTypes().get(0));
        assertEquals(Type.Poison, herbizarre.getTypes().get(1));

        //florizarre

        Florizarre florizarre = new Florizarre(); 
        assertEquals(2, florizarre.getTypes().size());
        assertEquals(Type.Plante, florizarre.getTypes().get(0));
        assertEquals(Type.Poison, florizarre.getTypes().get(1));
    }


    @Test
    public void TestPokemonObscurProxy() {

        //Test bulbizarre
        Pokemon PokemonInitial = new Bulbizarre(); 
        //Test des 2 types
        assertEquals(Type.Plante, PokemonInitial.getTypes().get(0));
        assertEquals(Type.Poison, PokemonInitial.getTypes().get(1));
        PokemonObscurProxy BulbizarreObscur = new PokemonObscurProxy(PokemonInitial);
        //Test du type Poison
        assertEquals(Type.Poison, BulbizarreObscur.getTypes().get(0));
        //Test purifier
        Pokemon Bulbizarre  = BulbizarreObscur.purifier();
        //Test des 2 types après purification
        assertEquals(Type.Plante, Bulbizarre.getTypes().get(0));
        assertEquals(Type.Poison, Bulbizarre.getTypes().get(1));

        //Test Herbizarre
        PokemonInitial = new Herbizarre();
        //Test des 2 types
        assertEquals(Type.Plante, PokemonInitial.getTypes().get(0));
        assertEquals(Type.Poison, PokemonInitial.getTypes().get(1));
        PokemonObscurProxy HerbizarreObscur = new PokemonObscurProxy(PokemonInitial);
        //Test du type Poison
        assertEquals(Type.Poison, HerbizarreObscur.getTypes().get(0));
        //Test purifier
        Pokemon Herbizarre  = HerbizarreObscur.purifier();
        //Test des 2 types après purification
        assertEquals(Type.Plante, Herbizarre.getTypes().get(0));
        assertEquals(Type.Poison, Herbizarre.getTypes().get(1));

        //Test florizarre
        PokemonInitial = new Florizarre();
        //Test des 2 types
        assertEquals(Type.Plante, PokemonInitial.getTypes().get(0));
        assertEquals(Type.Poison, PokemonInitial.getTypes().get(1));
        PokemonObscurProxy FlorizarreObscur = new PokemonObscurProxy(PokemonInitial);
        //Test du type Poison
        assertEquals(Type.Poison, FlorizarreObscur.getTypes().get(0));
       //Test purifier
       Pokemon Florizarre  = FlorizarreObscur.purifier();
       //Test des 2 types après purification
       assertEquals(Type.Plante, Florizarre.getTypes().get(0));
       assertEquals(Type.Poison, Florizarre.getTypes().get(1));
    }

    @Test
    public void TestPokemonObscurDecorator() {

        //Test bulbizarre
        Pokemon PokemonInitial = new Bulbizarre(); 
        //Test des 2 types
        assertEquals(Type.Plante, PokemonInitial.getTypes().get(0));
        assertEquals(Type.Poison, PokemonInitial.getTypes().get(1));
        PokemonObscurDecorator BulbizarreObscur = new PokemonObscurDecorator(PokemonInitial);
        //Test du type Poison
        assertEquals(Type.Poison, BulbizarreObscur.getTypes().get(0));
        //Test purifier
        Pokemon Bulbizarre  = BulbizarreObscur.purifier();
        //Test des 2 types après purification
        assertEquals(Type.Plante, Bulbizarre.getTypes().get(0));
        assertEquals(Type.Poison, Bulbizarre.getTypes().get(1));

        //Test Herbizarre
        PokemonInitial = new Herbizarre();
        //Test des 2 types
        assertEquals(Type.Plante, PokemonInitial.getTypes().get(0));
        assertEquals(Type.Poison, PokemonInitial.getTypes().get(1));
        PokemonObscurDecorator HerbizarreObscur = new PokemonObscurDecorator(PokemonInitial);
        //Test du type Poison
        assertEquals(Type.Poison, HerbizarreObscur.getTypes().get(0));
        //Test purifier
        Pokemon Herbizarre  = HerbizarreObscur.purifier();
        //Test des 2 types après purification
        assertEquals(Type.Plante, Herbizarre.getTypes().get(0));
        assertEquals(Type.Poison, Herbizarre.getTypes().get(1));

        //Test florizarre
        PokemonInitial = new Florizarre();
        //Test des 2 types
        assertEquals(Type.Plante, PokemonInitial.getTypes().get(0));
        assertEquals(Type.Poison, PokemonInitial.getTypes().get(1));
        PokemonObscurDecorator FlorizarreObscur = new PokemonObscurDecorator(PokemonInitial);
        //Test du type Poison
        assertEquals(Type.Poison, FlorizarreObscur.getTypes().get(0));
       //Test purifier
       Pokemon Florizarre  = FlorizarreObscur.purifier();
       //Test des 2 types après purification
       assertEquals(Type.Plante, Florizarre.getTypes().get(0));
       assertEquals(Type.Poison, Florizarre.getTypes().get(1));
    }

}