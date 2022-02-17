public class Schulklasse{
    
    private String name;
    private int stufe;
    private int schuelerzahl;
    private Lehrer klassenlehrer;
    
    public Schulklasse(String name, int stufe, int schuelerzahl, Lehrer klassenlehrer){
        this.name = name;
        this.stufe = stufe;
        this.schuelerzahl = schuelerzahl;
        this.klassenlehrer = klassenlehrer;
    }
    
    public String getName(){
        return name;
    }
    
    public int getStufe(){
        return stufe;
    }
    
    public int getAnzahl(){
        return schuelerzahl;
    }
    
    public void setStufe(int stufe){
        this.stufe = stufe;
    }
    
    public void setAnzahl(int schuelerzahl){
        this.schuelerzahl = schuelerzahl;
    }

    public void setKlassenlehrer(Lehrer klassenlehrer){
        this.klassenlehrer = klassenlehrer;
    }

    public Lehrer getKlassenlehrer(){
        return klassenlehrer;
    }
}