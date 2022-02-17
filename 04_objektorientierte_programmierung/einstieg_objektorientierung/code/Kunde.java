public class Kunde{

    private String name;
    private boolean weiblich;
    private Konto girokonto;

    public Kunde(String name, boolean weiblich, int kontonummer){
        this.name = name;
        this.weiblich = weiblich;
        
        girokonto = new Konto(kontonummer);
    }

    public string getName(){
        return name;
    }
    
    public boolean getWeiblich(){
        return weiblich;
    }

    public Konto getGirokonto(){
        return girokonto;
    }

    public void abheben(double betrag){
        if(girokonto.getKontostand() >= betrag){
            girokonto.auszahlen(betrag);
        }
    }

    public void einzahlen(double betrag){
        girokonto.einzahlen(betrag);
    }

    public void ueberweisen(double betrag, Kunde empfaenger){
        girokonto.ueberweisen(betrag, empfaenger.getGirokonto());
    }
}