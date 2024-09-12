package Tasks;

public class Container {
    public static int containers(int k, int m, int b){
        return ((k * 20 )+ (m * 50 ) + (b * 100));}

    
    public static void main(String[] args){
        int k = 3;
        int m = 4;
        int b = 2;
        int Hcontain = containers(k, m, b);
        System.out.println(Hcontain);
        
    }
    
    
    
    }
