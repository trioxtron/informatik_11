public class Auto extends Fahrzeug{
    
    public Auto(double tankgroesse, int kilometerstand, double tankinhalt){
        super(tankgroesse, kilometerstand, tankinhalt);
    }
    
    public void autobahnFahren(int strecke){
        fahre(strecke, 8);
    }
}