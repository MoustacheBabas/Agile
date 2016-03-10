
/**
 * Write a description of class Pomme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pomme
{
    // instance variables - replace the example below with your own
    Ornithorynque ornithorynque;
    private double poids;
    

    public Pomme()
    {
        // initialise instance variables
        this.poids = 1;
    }
    
    public Pomme(double poids)
    {
        this.poids = poids;
    }

    public double getPoids()
    {
        return this.poids;
    }
    
    public void setPoids(double poids)
    {
        this.poids = poids;
    }
    
    public void setOrnithorynque(Ornithorynque ornithorynque)
    {
        this.ornithorynque = ornithorynque;
    }
    
    public void estMangee()
    {
        ornithorynque.setPoids(ornithorynque.getPoids() + this.poids);
    }
}
