import java.lang.runtime.SwitchBootstraps;
import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Objects;


class tasks3 {

    public static void main(String[] args) {
        // для 7
        String[][] inventory1 = {
                {"Скакалка", "550", "8"},
                {"Шлем", "3750", "4"},
                {"Мяч", "2900", "10"}};
        //1
        System.out.println(isStrangePair("repeat", "lalader"));
        System.out.println(isStrangePair("aepeaw", "waladea"));
        //2
        System.out.println("nSale:");
        Object[][] items = {
                {"Laptop", 124200},
                {"Phone", 51450},
                {"Headphones", 13800}
        };

        List<Object[]> result = sale(items, 25);
        for (Object[] item : result) {
            System.out.println(item[0] + ": " + item[1]);
        }


        //3
        System.out.println(SucsessShoot(0, 0, 5, 2, 2));
        System.out.println(SucsessShoot(5, 5, 3, -2, -14));
        //4
        System.out.println(parityAnalysis(244));
        System.out.println(parityAnalysis(13));
        //5
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("scissors", "paper"));
        //6
        System.out.println(bugger(999));
        //7
        System.out.println(mostExpensive(inventory1));
        //8
        System.out.println(longestUnique("abcba"));
        //9
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        //10
        System.out.println(doesBrickFit(1, 2, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 2, 1, 1));

    }

    //1
    public static boolean isStrangePair(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        }

        boolean con1 = str1.charAt(0) == str2.charAt(str2.length() - 1);

        boolean con2 = str1.charAt(str1.length() - 1) == str2.charAt(0);

        return con1 && con2;
    }

    //2

    public static List<Object[]> sale(Object[][] items, int discount) {
        List<Object[]> discountedItems = new ArrayList<>();

        for (Object[] item : items) {
            String name = (String) item[0];
            int price = (int) item[1];
            int newPrice = (int) Math.round(price * (1 - discount / 100.0));
            newPrice = Math.max(newPrice, 1);
            discountedItems.add(new Object[]{name, newPrice});
        }

        return discountedItems;
    }



    //3
        public static boolean SucsessShoot(int x, int y, int r, int m, int n) {
            return  Math.pow(m - x, 2 ) + Math.pow(n - y, 2) <= Math.pow(r, 2);

        }


        //4
        public static boolean parityAnalysis(int ins) {
            int inscop = ins;
            int size = 0;
            while (ins > 0) {
                int l = ins % 10;
                size = size + l;
                ins /= 10;
            }
            return  (inscop % 2 == 0 && size % 2 == 0);
        }

        //5
        public static String rps(String p1, String p2) {
            p1 = p1.toLowerCase();
            p2 = p2.toLowerCase();

            if(p1.equals(p2)){
                return "Tie";
            }
            switch (p1){
                case "rock" :
                    return p2.equals("scissors") ? "1 Win" : "2 Win";

                case "scissors" :
                    return p2.equals("rock") ? "2 Win" : "1 Win";

                case  "paper" :
                    return p2.equals("rock") ? "1 Win" : "2 Win";

                default:
                    return "ошибка";
            }
        }

        // 6
        public static int bugger(int num) {
            if (num < 10) return 0; // Если уже одна цифра

            int count = 0;
            while (num >= 10) {
                int product = 1;
                while (num > 0) {
                    product *= num % 10;
                    num /= 10;
                }
                num = product;
                count++;
            }
            return count;
        }




        //7
        public static String mostExpensive(String[][] inventory) {
            int maxTotalPrice = 0;
            String item = "";
            for (String[] inv : inventory) {
                int totalPrice = Integer.parseInt(inv[1]) * Integer.parseInt(inv[2]);
                if (totalPrice > maxTotalPrice) {
                    maxTotalPrice = totalPrice;
                    item = inv[0];
                }
            }
            return item + "-" + maxTotalPrice;
        }

        //8
        public static String longestUnique(String str) {
            int n = str.length();
            int maxLength = 0;
            int start = 0; // Начало текущей подстроки
            String longestSubstr = "";

            HashSet<Character> charSet = new HashSet<>();

            for (int end = 0; end < n; end++) {
                // Если символ уже в множестве, сдвигаем начало
                while (charSet.contains(str.charAt(end))) {
                    charSet.remove(str.charAt(start));
                    start++;
                }
                charSet.add(str.charAt(end));

                // Обновляем максимальную длину и подстроку
                if (end - start + 1 > maxLength) {
                    maxLength = end - start + 1;
                    longestSubstr = str.substring(start, end + 1);
                }
            }

            return longestSubstr;
        }

            //9
        public static boolean isPrefix(String word, String prefix) {
            return word.startsWith(prefix.substring(0, prefix.length() - 1));
        }

        public static boolean isSuffix(String word1, String suffix) {
            return word1.endsWith(suffix.substring(1));
        }

        //10
        public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
            return (a <= w && b <= h) || (a <= h && b <= w) ||
                    (a <= w && c <= h) || (a <= h && c <= w) ||
                    (b <= w && c <= h) || (b <= h && c <= w);
        }
    }








