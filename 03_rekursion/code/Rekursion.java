public class Rekursion{
    public int rekFak(int n){
        if(n==0){
            return 1;
        } else {
            return n * rekFak(n-1);
        }
    }
    
    public int itFak(int n){
        int result = 1;
        for(int i = 1; i<=n; i++){
            result *= i;
        }
        return result;
    }
    
    public int powTwo(int n){
        if(n==0){
            return 1;
        } else {
            return 2*powTwo(n-1);
        }
    }
    
    public int prod(int a, int b){
        if(b==0){
            return 0;
        } else {
            return a+prod(a, b-1);
        }
    }
    
    public double bak(int a, int n){
        if(n==0){
            return a;
        } else {
            return 1.2*bak(a, n-1);
        }
    }
    
    public int ggT(int a, int b){
        if (a==b){
            return b;
        } else if(a>b) {
            return ggT(a-b, b); 
        } else {
            return ggT(a, b-a);
        }
    }
    
    public int straights(int n){
        if(n==1){
            return 1;
        } else {
            return 2*n-1+straights(n-1);
        }
    }
    
    // Start der Baumrekursion
    
    public int rek1(int n){
        if(n==0){
            return 1;
        }else if(n==1){
            return 2;
        } else{
            return 2 * rek1(n-2) + 3 * rek1(n-1);
        }
    }
    
    public int rek2(int n){
        if(n==0){
            return 1;
        } else {
            return 2 * rek2(n-1) + 3;
        }
    }
    
    
    //Endrekursion
    
   private int rek(int n, int a){
       if(n==0){
           return a;
       } else {
           return rek(n-1, 2 * a + 3);           
       }
       
   }
   
   public int rek(int n){
       return rek(n, 1);
   }
   
   
   //End - und Baumrekursion
   private int rekP(int n, int a, int b){
       if(n==0){
           return a;
       } else if (n==1){
           return b;
       } else {
           return rekP(n-1, b, 3 * b + 2 * a);
       }
   }
   
   public int rekE(int n){
       return rekP(n, 1, 2);
   }

   public int pot(int a, int b){
       if(b==0){
           return 1;
       } else {
           return a * pot(a, b-1);
       }
    }
   
   //Arithmetische Laufzeit   
   public int smartPot(int a, int b){
       if(b==0){
           return 1;
       } else if(b<0){
           return 1 / smartPot(a, b * (-1));
       } else if(b%2==0) {
           int erg = smartPot(a, b/2);
           return erg * erg;
       } else {
           int erg = smartPot(a, b/2);
           return a * erg * erg;
       }
   }
   
   
   //Endrekursion bei arithmetischer Laufzeit
   private int endSmartPot(int a, int b, int c){
       if(b==1){
           return c;
       } else if(b%2==0) {
           return endSmartPot(a, b/2, c*c);
       } else {
           return endSmartPot(a, b/2, a*c*c);
       }
   }
   
   public int endSmartPot(int a, int b){
       if(b<0){
           return endSmartPot(a, b*(-1), a);
       } else if(b==0){
           return 1;
       } else {
           return endSmartPot(a, b, a);
       }
    }
}






