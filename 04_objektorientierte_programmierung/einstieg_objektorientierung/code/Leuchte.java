public class Leuchte{

    private String farbe;
    private boolean leuchtet;
    private boolean defekt;
    
    public Leuchte(String farbe, boolean leuchtet){
        defekt = false;
        this.farbe = farbe;
        this.leuchtet = leuchtet;
    }
}