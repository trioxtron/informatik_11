public class Professor extends Mitarbeiter{
    private String fachbereich;
    
    public Professor(String fachbereich, String name, int stunden, int personalnr){
        super(name, stunden, personalnr);
        
        this.fachbereich = fachbereich;
    }
    
    public String getFachbereich(){
        return fachbereich;
    }
    
    public void setFachbereich(String fachbereich){
        this.fachbereich = fachbereich;
    }
    
    public double gehaltBerechnen(){
        return 0;
    }
}
