public class Buch{
    private String autor;
    private String titel;
    private int seitenzahl;
    private boolean entliehen;
    
    public Buch(String autor, String titel, int seitenzahl){
        this.autor = autor;
        this.titel = titel;
        this.seitenzahl = seitenzahl;
        entliehen = false;
    }
    
    public String getAutor(){
        return autor;
    }

    public String getTitel(){
        return titel;
    }
    
    public int getSeitenzahl(){
        return seitenzahl;
    }
    
    public void ausleihen(){
        if(entliehen == false){
            entliehen = true;
        } else {
            System.out.println("Das Buch ist bereits ausgeliehen");
        }
    }
    
    public void zurueckgeben(){
        entliehen = false;
    }
}