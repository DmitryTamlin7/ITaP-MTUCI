public class Primes {

    
    public static void main(String[] args){
        for(int i =2; i <=100; i++){
            if(IsPrime(i)) {
                System.out.println(i + "");
            }
        }
    }
    
    
    
    
    
    
    public static boolean IsPrime(int x){
        
        for(int i=2; x>i; i++){
            if(x % i ==0){
                return false;
            }

        }
        return true;
}}
