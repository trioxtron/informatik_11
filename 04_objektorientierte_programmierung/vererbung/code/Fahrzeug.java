public abstract class Fahrzeug{
    protected double tankgroesse;
    protected int kilometerstand;
    protected double tankinhalt;
    
    public Fahrzeug(double tankgroesse, int kilometerstand, double tankinhalt){
        this.tankgroesse = tankgroesse;
        this.kilometerstand = kilometerstand;
        this.tankinhalt = tankinhalt;        
    }
    
    public double getTankinhalt(){
        return tankinhalt;
    }
    public int getKilometerstand(){
        return kilometerstand;
    }
    
    public boolean passtInTank(double menge){
        return tankinhalt + menge <= tankgroesse;
    }
    
    public void tanke(double menge){
        if(passtInTank(menge)){
            tankinhalt += menge;
        }
    }
    
    public void fahre(int strecke, int verbrauch){
        kilometerstand += strecke;
        tankinhalt -= strecke * verbrauch/100;
    }
}