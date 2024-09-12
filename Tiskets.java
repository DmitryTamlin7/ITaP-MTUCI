package Tasks;

public class Tiskets {

        public static double Ctic(int a, int b) {
             double x = (a*b) - (a*b * 0.28);
            
            return x ;                
        }
        public static void main(String args){

            System.out.println(Ctic(70, 1500));
        }
}
