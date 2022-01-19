package application;

public class PacGommeFactory {

    private static int count = 0;
    
    private PacGommeFactory(){}

    public static IPacGomme getPacGomme(){
        if (count == 15){ //nb créé avant la nouvelle création de IPacGomme
            count = 0;
            return new PacGommeBoost();        
        }
        else{
            count++;
            return new PacGommeNormal();
        } 
        
    }

    
}
