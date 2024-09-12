package Tasks;

public class max {
    public  static int ternaryEvaluation(int a, int b ) {
        int max = a > b ? a : b;
        return max;
    }
    public static void main(String[] args){
        int a = 8;
        int b = 9;
        System.out.println(ternaryEvaluation(a, b));
    }
    
}
