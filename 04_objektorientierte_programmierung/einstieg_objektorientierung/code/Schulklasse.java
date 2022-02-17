public class Schulklasse{
    
    private String name;
    private int stufe;
    private int schuelerzahl;
    
    public Schulklasse(String name, int stufe, int schuelerzahl){
        this.name = name;
        this.stufe = stufe;
        this.schuelerzahl = schuelerzahl;
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
}