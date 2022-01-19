package application;

public class Labyrinthe {

    public Pacman heros;

    public IPacGomme[] ennemies;

    public Labyrinthe(){
        heros = Pacman.getInstance(); 
        ennemies = new IPacGomme[50];
        int i;
        for (i = 0; i<50; i++){
            ennemies[i] = PacGommeFactory.getPacGomme();
        }   
    }
    
}
