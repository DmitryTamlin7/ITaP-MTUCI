package Tasks;

public class Tables {
    public static int tables(int x, int y) {
        int p = y * 2;
        if(p - x  > 0){
            return 0;}
        
        else{
            int y1 = x - p;
            if(y1 % 2 ==0) {
                int y2= y1 /2;
                return y2;
            }
            else{
                int y2 = (y1+1) /2;
                return y2;
            }}

    } 
    public static void main(String args){
        System.out.println(tables(5, 2));
    }
    
}
