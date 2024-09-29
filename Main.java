import  java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 12, 7, 122, 53};
        double [] array1 = {3.1, 0, 1.11, 1.11 , 0 , 13.4};
        double [] array2 = {3.5, 7.0, 1.5, 9.0, 5.5};

        System.out.println(duplicateChars("barack", "obama"));
        System.out.println(getInitials("сергей","сергеевич","симонов"));
        System.out.println(equal(5, 4, 1));
        System.out.println(dividedByThree(array));
        System.out.println(secondBiggest(array));
        System.out.println(camelToSnake("HelloWorld"));
        System.out.println(Arrays.toString(compressedNums(array1)));
        System.out.println(Arrays.toString(normalizator(array2)));
        System.out.println(localReverse("baobab", 'b'));
        System.out.println(isAnagram("LISTEN", "silent") );


    }
//1
    public static String duplicateChars(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (char ch : str1.toCharArray()) {
            if (str2.indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }

//2
    public static int dividedByThree(int[] arr) {

        int count = 0;
        for( int num = 0; num < arr.length; num++){

        if (arr[num] % 3 ==0 && arr[num] % 2 != 0) {

            count ++;
        }


        }
        return count;

    }

//3
    public static String getInitials(String a, String b, String c) {

        String x3 = c.toUpperCase() +" "+ a.toUpperCase().charAt(0) + "." + b.toUpperCase().charAt(0) + "." ;

                return x3;
    }

//4
    public static double [] normalizator(double[] arr){
        double min = Arrays.stream(arr).min().getAsDouble();
        double max = Arrays.stream(arr).max().getAsDouble();

        double[] normalizedArr = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            normalizedArr[i] = (arr[i] - min) / (max - min);
        }
        return normalizedArr;

    }


//5
    public static int[] compressedNums(double[] arr){
        return  Arrays.stream(arr)
                .filter(num -> num != 0)
                .mapToInt(num -> (int) num)
                .distinct()
                .sorted()
                .toArray();

    }

//6
    public  static String camelToSnake(String str) {
        return  str.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();



    }





//7

    public  static int secondBiggest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 2];


    }
//8

    public static String localReverse(String str, char marker) {
        String[] parts = str.split(marker + "");
        for (int i = 1; i < parts.length; i += 2) {
            parts[i] = new StringBuilder(parts[i]).reverse().toString();
        }
        return String.join(marker + "", parts);
    }


//9
    public static int equal(int a, int b, int c){

        int count = 0;
        if(a == b){
            count +=2;
        }

        if(a == c){
            count +=2;
        }

        if(b == c) {
            count +=2;
        }
        if(count >3){
            count -=1;
        }
        return count;

    }
//10
    public  static boolean isAnagram(String str1, String str2 ){
        char[] Chararr1 =   str1.toLowerCase().toCharArray();
        char[] Chararr2 =   str2.toLowerCase().toCharArray();

        Arrays.sort(Chararr1);
        Arrays.sort(Chararr2);

        return Arrays.equals(Chararr1, Chararr2);


    }
}