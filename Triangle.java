package Tasks;

public class Triangle {
    
    public static String TriangleType(int x, int y, int z) {
        // Проверка на возможность существования треугольника
        if (x <= 0 || y <= 0 || z <= 0 || (x + y <= z) || (x + z <= y) || (y + z <= x)) {
            return "not a triangle";
        }
        
        // Определение типа треугольника
        if (x == y && y == z) {
            return "isosceles";
        } else if (x == y || y == z || x == z) {
            return "equilateral";
        } else {
            return "different-sided";
        }
    }

    public static void main(String[] args) {
    
        System.out.println(TriangleType(3, 3, 3));
        System.out.println(TriangleType(3, 4, 3)); 
        System.out.println(TriangleType(3, 4, 5)); 
        System.out.println(TriangleType(1, 2, 3)); 
    }
}
