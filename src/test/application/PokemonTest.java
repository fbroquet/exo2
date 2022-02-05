package com.tetras.librarie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class PokemonTest {


    @Test
    public void BulbizarreToHerbizarre() {
        Bulbizarre Test = new Bulbizarre(); 
        Pokemon Evo = Test.evoluer();
        assertTrue(Evo instanceof Herbizarre);
    }
    @Test
    public void HerbizarreToFlorizarre() {
        Herbizarre Test = new Herbizarre(); 
        Pokemon Evo = Test.evoluer();
        assertTrue(Evo instanceof Florizarre);
    }
    @Test
    public void FlorizarreToMegaFlorizarre() {
        FlorizarreMegaEvoluale Test = new FlorizarreMegaEvoluale(); 
        Pokemon Evo = Test.evoluer();
        assertTrue(Evo instanceof MegaPokemon);
    }
    @Test
    public void DeuxTypes() {
        Herbizarre Test = new Herbizarre();
        List<Type> Types = Test.getTypes();
        assertEquals(Types.get(0), Type.Plante);
        assertEquals(Types.get(1), Type.Poison);
        Florizarre Test2 = new Florizarre();
        List<Type> Types2 = Test2.getTypes();
        assertEquals(Types2.get(0), Type.Plante);
        assertEquals(Types2.get(1), Type.Poison);
        Bulbizarre Test3 = new Bulbizarre();
        List<Type> Types3 = Test3.getTypes();
        assertEquals(Types3.get(0), Type.Plante);
        assertEquals(Types3.get(1), Type.Poison);
    }
    @Test
    public void Obscur() {
        PokemonObscurDecorator bulbizObscur = new PokemonObscurDecorator(new Bulbizarre());
        assertEquals(Type.Poison, bulbizObscur.getTypes().get(0));
    }

}