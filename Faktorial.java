package Tasks;

public class Faktorial {
    public static int factorial(int x) {
        int result = 1;
         for(int i = x; i > 0; i --){
            result *= i;
         }
        return result;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(factorial(x));
    }
    
}
