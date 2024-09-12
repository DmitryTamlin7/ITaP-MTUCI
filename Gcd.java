package Tasks;

public class Gcd {
    public static int gcd(int a, int b){
        int gcd = 1;
    for (int i = 1; i <= a && i <= b; i++) {
        if (a % i == 0 && b % i == 0) {
            gcd = i;
        }
    }
    return gcd;
        
    }
    public static void main(String args){

        System.out.println(gcd(120, 240));
    }
    
}
