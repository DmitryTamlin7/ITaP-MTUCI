package Tasks;

public class Gallons { 
    public static   double gallon_liter = 3.78541;
        
        public static double convert(int gallons) {
            return gallons * gallon_liter;
        
        }
    public static void main(String[] args) {
        int gallons = 5;
        double liters = convert(gallons);
        System.out.println(liters);
    }
    
    }// ЗАдание 1 галоны




    

