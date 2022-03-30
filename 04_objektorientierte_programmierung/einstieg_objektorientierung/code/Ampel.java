public class Ampel{
    
    private int nummer;
    private Leuchte l1;
    private Leuchte l2;
    private Leuchte l3;
    private boolean hatStrom;
    private boolean defekt;
    
    public Ampel(int nummer, Leuchte l1, Leuchte l2, Leuchte l3){
        hatStrom = true;
        defekt = false;
            
        this.nummer = nummer;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    
    public int getNummer(){
        return nummer;
    }
    
    public Leuchte getLeuchte1(){
        return l1;
    }
    
    public Leuchte getLeuchte2(){
        return l2;
    }
    
    public Leuchte getLeuchte3(){
        return l3;
    }
    
    
}
