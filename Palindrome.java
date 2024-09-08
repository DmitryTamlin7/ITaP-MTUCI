public class Palindrome {
    public static void main(String[] args){

        String str = "noon"; 
    
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
    
        if (str.equals(str1.toString())) {
            System.out.println( str + " Palindromme");
        }
        else{
            System.out.println(str + " No Palindrome");
        }
    }}
