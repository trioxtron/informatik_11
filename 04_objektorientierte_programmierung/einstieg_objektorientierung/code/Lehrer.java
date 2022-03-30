public class Lehrer{
    
    private String name;
    private String kuerzel;
    private String fach;
    private Auto fahrzeug;
    
    
    public Lehrer(String name, String kuerzel, String fach){
        this.name = name;
        this.kuerzel = kuerzel;
        this.fach = fach;
    }
    
    public String getName(){
        return name;
    }
    
    public String getKuerzel(){
        return kuerzel;
    }
    
    public String getFach(){
        return fach;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setKuerzel(String kuerzel){
        this.kuerzel = kuerzel;
    }
    
    public String getFahrzeug(){
        return fahrzeug.getKennzeichen();
    }
    
    public void setFahrzeug(Auto fahrzeug){
        this.fahrzeug = fahrzeug;
    }
}