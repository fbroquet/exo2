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
    public void TestPokemonObscur() {

        //Test bulbizarre
        Pokemon PokemonInitial = new Bulbizarre(); 
        //Test des 2 types
        assertEquals(Type.Plante, PokemonInitial.getTypes().get(0));
        assertEquals(Type.Poison, PokemonInitial.getTypes().get(1));
        PokemonObscur BulbizarreObscur = new PokemonObscur(PokemonInitial);
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
        PokemonObscur HerbizarreObscur = new PokemonObscur(PokemonInitial);
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
        PokemonObscur FlorizarreObscur = new PokemonObscur(PokemonInitial);
        //Test du type Poison
        assertEquals(Type.Poison, FlorizarreObscur.getTypes().get(0));
       //Test purifier
       Pokemon Florizarre  = FlorizarreObscur.purifier();
       //Test des 2 types après purification
       assertEquals(Type.Plante, Florizarre.getTypes().get(0));
       assertEquals(Type.Poison, Florizarre.getTypes().get(1));

        //test megaFlorizarre
        PokemonInitial = new MegaFlorizarre();
        //Test des 2 types
        assertEquals(Type.Plante, PokemonInitial.getTypes().get(0));
        assertEquals(Type.Poison, PokemonInitial.getTypes().get(1));
        PokemonObscur MegaFlorizarreObscur = new PokemonObscur(PokemonInitial);
        //Test du type Poison
        assertEquals(Type.Poison, MegaFlorizarreObscur.getTypes().get(0));
       //Test purifier
       Pokemon MegaFlorizarre  = MegaFlorizarreObscur.purifier();
       //Test des 2 types après purification
       assertEquals(Type.Plante, MegaFlorizarre.getTypes().get(0));
       assertEquals(Type.Poison, MegaFlorizarre.getTypes().get(1));

    }

}