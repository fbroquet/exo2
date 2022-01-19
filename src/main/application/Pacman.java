package application;

public class Pacman {

    private static Pacman instance = new Pacman();

    private Pacman(){}

    public static Pacman getInstance(){
        return instance;
    }
    
}

