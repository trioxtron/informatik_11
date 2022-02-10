public class Aufgaben{

    public int max(int a, int b) {
        if( a > b){
            return a;
        } else {
            return b;
        }
    }

    public int min(int a, int b) {
        if( a < b){
            return a;
        } else {
            return b;
        }
    }

    public int threeNumbersMax(int a, int b, int c){
        return max(max(a, b), c);
    }

    public int threeNumbersMin(int a, int b, int c){
        return min(min(a, b), c);
    }

    public void numbers(int n){
        for (int i=1; i<=n; i++){
            System.out.println(i);
        }
    }

    public int whileFakultaet(int n){
        int result = 1;
        int i = 1;
        while(i<=n){
            result *= i;
        }
        return result; 
    }

    public int forFakultaet(int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }

    public int sum(int n){
        int result = 0;
        for(int i=0; i<=n; i++){
            result += i;
        }
        return result;
    }

    public int power(int x, int n){
        int result=x;
        for (int i; i<n; i++){
            result *= x;
        }
        return result;
    }
    
    public int powerSum(int n){
        int result = 0;
        for(int i=0; i<=n; i++){
            result += i*i;
        }
        return result;
    }

    public boolean even(int a){
        return a%2 == 0; 
    }

    public boolean divider(int a, int b){
        return b%a == 0;
    }

    public int dividerCount(int n){
        int result = 0;
        for(int i=0; i<=n; i++) {
            if(n%i == 0){
                result++;
            }
        }
        return result;
    }

    public boolean isPrim(int n){
        return dividerCount(n) == 2;
    }

    public int dividerSum(int n){
        int result = 0;
        for(int i=0; int<=n; i++){
            if(n%i == 0){
                result += i;
            }
        }
        return result;
    }

    public boolean isPerfectNumber(int n){
        int result=0;
        for(int i; i<n; i++){
            if(n%i == 0){
                result += i;
            }
        }
        return result == n;
    }

    public int countPrim(int n){
        int counter=0;
        for(int i; i<=n; i++){
            if(isPrim(i)){
                counter++;
            }
        }
    }

    public int countPerfectNumbers(int n){
        int counter=0;
        for(int i; i<=n; i++){
            if(isPerfectNumber(i)){
                counter++;
            }
        }
    }

    public int printPrim(int n){
        for(int i; i<=n; i++){
            if(isPrim(i)){
                System.out.println(i);
            }
        }
    }

    public int printPerfectNumbers(int n){
        for(int i; i<=n; i++){
            if(isPerfectNumber(i)){
                Sytenm.out.println(i);
            }
        }
    }

    public int mostDividers(int n){
        int result;
        for(int i=0; i<n; i++){
            if(dividerCount(i) > dividerCount(result)){
                result = i;
            }
        }
        return result;
    }

    public int biggestDividers(int n){
        int result;
        for(int i=0; i<n; i++){
            if(dividerSum(i) > dividerSum(result)){
                result = i;
            }
        }
        return result;
    }
}