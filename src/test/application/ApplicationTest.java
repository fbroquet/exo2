package application;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;



import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    public void testPacMan() {

        Pacman pac1 = Pacman.getInstance();
        Pacman pac2 = Pacman.getInstance();
        //assertEquals(1, 2);
        assertEquals(pac1, pac2);
    }

    @Test
    public void testPacGomme() {

        //PacGommeFactory PGFact = new PacGommeFactory();
        IPacGomme PG;
       // PG = PacGommeFactory.getPacGomme(); //on créée le premier PacGomme
        //assertEquals(1, 2);
        for (int i=1;i<=50;i++){
            PG = PacGommeFactory.getPacGomme();
            //assertEquals(1, 2);
            if ((i % 16) == 0){ // tous les 15 créé
                assertTrue(PG instanceof PacGommeBoost);
                //assertEquals(1, 2);
                assertEquals(10, PG.getTaille()); 
                assertEquals("bleue", PG.getCouleur());
            }
            else {
                assertTrue(PG instanceof PacGommeNormal);
                //assertEquals(1, 2);
                assertEquals(5, PG.getTaille());
                assertEquals("jaune", PG.getCouleur());
            }
        }
    }

    @Test
    public void TestLabyrinthe() {

        Labyrinthe niveau = new Labyrinthe();
        Pacman pac2 = Pacman.getInstance();
        assertEquals(niveau.heros, pac2);

        assertTrue(niveau.ennemies[14] instanceof PacGommeNormal);
        assertTrue(niveau.ennemies[15] instanceof PacGommeBoost); //le 16ième du tableau
        assertTrue(niveau.ennemies[16] instanceof PacGommeNormal);
        assertTrue(niveau.ennemies[30] instanceof PacGommeNormal);
        assertTrue(niveau.ennemies[31] instanceof PacGommeBoost);
        assertTrue(niveau.ennemies[32] instanceof PacGommeNormal);
        assertTrue(niveau.ennemies[46] instanceof PacGommeNormal);
        assertTrue(niveau.ennemies[47] instanceof PacGommeBoost);
        assertTrue(niveau.ennemies[48] instanceof PacGommeNormal);
    }

}