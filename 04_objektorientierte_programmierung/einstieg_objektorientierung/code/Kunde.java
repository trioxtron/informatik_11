
import java.util.*;

public class Kunde{

    private String name;
    private boolean weiblich;
    private Konto girokonto;
    LinkedList <Buch> lst = new LinkedList <Buch> ();
    
        
    public Kunde(String name, boolean weiblich, int kontonummer){
        this.name = name;
        this.weiblich = weiblich;
        
        girokonto = new Konto(kontonummer);
    }

    public String getName(){
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
    
    public void buchLeihen(Buch buch){
        if(buch.getAusgeliehen()) {    
            return;
        }
        lst.add(buch);        
        buch.ausleihen();
    }
    
    public void buchZurueckgeben(Buch buch){
        for(int i=0; i<=lst.size(); i++){
            if(lst.get(i) == buch){
                lst.remove(i);
                buch.zurueckgeben();
            }
        }
    }
    
    public void printBuecher(){
        for(int i=0; i<=lst.size(); i++){
            System.out.println(lst.get(i).getTitel());
        }
    }
}