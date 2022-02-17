public class Konto{
    private double kontostand;
    private int kontonummer;
    private boolean gesperrt;
    
    public Konto(int kontonummer){
        kontostand = 0;
        gesperrt = false;
        this.kontonummer = kontonummer;
    }
    
    public void setGesperrt(boolean g){
        gesperrt = g;
    }
    
    public String getInhaber(){
        return inhaber;
    }
    
    public void einzahlen(double betrag){
        kontostand += betrag;
    }
    
    public void auszahlen(double betrag){
        kontostand -= betrag;
    }
    
    public double getKontostand(){
        return kontostand;
    }
    
    public void setKontostand(double betrag){
        kontostand = betrag;
    }
    
    public void ueberweisen(double betrag, Konto empfaenger){
        double vorherEmpfaenger = empfaenger.getKontostand();
        double vorherueberweiser = getKontostand();
        
        if(getKontostand() >= betrag && betrag > 0){
            kontostand -= betrag;
        } else {
            System.out.println("Aus dem Weg Geringverdiener");
        }
        if(kontostand == vorherueberweiser - betrag){
            empfaenger.einzahlen(betrag);
        }
        if(empfaenger.getKontostand() != vorherEmpfaenger + betrag){
            System.out.println("Es ist ein Fehler aufgetreten");
            setKontostand(vorherueberweiser);
            empfaenger.setKontostand(vorherEmpfaenger);
        }
        
    }
}