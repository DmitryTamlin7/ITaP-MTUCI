public class Palindrome {
        public static void main(String[] args) {
            
                String s = args[0];
                if (isPalindrome(s)) {
                    System.out.println(s + " palindrome");
                } else {
                    System.out.println(s + " no palindrome");
                }}
            
        

        public static String reverseString(String s) {
            String reversed = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.charAt(i);
            }
            return reversed;
        }

        public static boolean isPalindrome(String s) {
            return s.equals(reverseString(s));
        }
}

