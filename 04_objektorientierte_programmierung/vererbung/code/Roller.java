public class Roller extends Fahrzeug{
    private int baujahr;
    
    public Roller(int baujahr, double tankgroesse, int kilometerstand, double tankinhalt){
        super(tankgroesse, kilometerstand, tankinhalt);
        
        this.baujahr = baujahr;
    } 
    
    public int getBaujahr(){
        return baujahr;
    }
}