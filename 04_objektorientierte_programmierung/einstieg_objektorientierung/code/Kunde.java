public class Kunde{

    private String name;
    private boolean weiblich;
    private Konto girokonto;

    public Kunde(String name, boolean weiblich, Konto girokonto){
        this.name = name;
        this.weiblich = weiblich;
        this.girokonto = girokonto
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
}