package application;

public class PacGommeBoost implements IPacGomme{
    
    public int taille = 10;
    public String couleur = "bleue";

    public PacGommeBoost(){}

    public int getTaille(){
        return taille;
    }
    public String getCouleur(){
        return couleur;
    }    
}
