public class Angestellter extends Mitarbeiter{
    private boolean personalrat;
    
    public Angestellter(boolean personalrat, String name, int stunden, int personalnr){
        super(name, stunden, personalnr);
        
        this.personalrat = personalrat;        
    }
    
    public boolean getPersonalrat(){
        return personalrat;
    }
    
    public void setPersonalrat(boolean personalrat){
        this.personalrat = personalrat;
    }
    
    public double gehaltBerechnen(){
        return 0.1 * stunden * 4;
    }
}