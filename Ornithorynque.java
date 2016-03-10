
/**
 * Write a description of class Ornithorynque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ornithorynque
{
    // instance variables - replace the example below with your own
    private double taille;
    private double poids;

    /**
     * Constructor for objects of class Ornithorynque
     */
    public Ornithorynque()
    {
        // initialise instance variables
        this.taille = 0;
        this.poids = 0;
    }

    
    public Ornithorynque(double taille, double poids)
    {
        // initialise instance variables
        this.taille = taille;
        this.poids = poids;
    }

   
    public double IMC()
    {
        // put your code here
        return poids / (taille*taille);
    }
    
    public double getTaille()
    {
        return taille;
    }
    
    public void setTaille(double taille)
    {
        this.taille = taille;
    }
    
    public double getPoids()
    {
        return poids;
    }
    
    public void setPoids(double poids)
    {
        this.poids = poids;
    }
}
