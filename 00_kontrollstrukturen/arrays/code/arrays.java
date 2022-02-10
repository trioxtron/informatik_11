public class Arrays{
    public int[]zahlen = new int[10]

    public void fuellen(){
        for(int i=0; i < zahlen.length; i++) {
            zahlen[i] = i+1;
        }
    }

    public void ausgeben(){
        for(int i=0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);   
        }
    }

    public void fuellenZufall(){
        for(int i=0; i < zahlen.length; i++) {
            zahlen[i] = (int)(Math.random()*10+1);    
        }
    }

    public void quadrieren(){
        for(int i=0; i < zahlen.length; i++) {
            zahlen[i] = zahlen[i] * zahlen[i];    
        }
    }

    public int summe(){
        var sum int;
        for(int i=0; i < zahlen.length; i++) {
            sum += zahlen[i];       
        }
    }

    public int anzahl(int n){
        var counter int;
        for(int i=0; i < zahlen.length; i++) {
            if (i == n){
                counter++;
            }       
        }
        return counter;
    }

    public int max(){
        var maxNum int;
        for(int i=0; i < zahlen.length; i++) {
            if(zahlen[i] > maxNum){
                maxNum = zahlen[i];
            }
        }
        return maxNum;
    }

    public int min(){
        var minNum int;
        for(int i=0; i < zahlen.length; i++) {
            if(zahlen[i] < minNum){
                minNum = zahlen[i];
            }
        }
        return minNum;
    }

    public boolean suche(int n){
        for(int i=0; i < zahlen.length; i++) {
            if(zahlen[i] == n){
                return true;
            }   
        }
        return false;
    }
}