public abstract class Mitarbeiter extends Mensch{
    protected int personalnr;
    protected int stunden;
    
    public Mitarbeiter(String name, int stunden, int personalnr){
        super(name);
        
        this.personalnr = personalnr;
        this.stunden = stunden;
    }
    
    public int getPersonalnr(){
        return personalnr;
    }
    
    public void setPersonalnr(int personalnr){
        this.personalnr = personalnr;
    }
    
    public int getStunden(){
        return stunden;
    }
    
    public void setStunden(int stunden){
        this.stunden = stunden;
    }
    
    public abstract double gehaltBerechnen();
    
}