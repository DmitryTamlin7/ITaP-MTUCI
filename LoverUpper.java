//Задание 3: Поиск заглавной буквы после строчной
//Необходимо написать программу, которая будет находить все случаи в
//тексте, когда сразу после строчной буквы идет заглавная, без какого-либо
//символа между ними, и выделять их знаками «!» с двух сторон

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoverUpper {
    public static void main(String[] args) {
        String text = "lloermkgAlAAllfmeiOelwOOodle";
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll(" !$1$2! "); // пробелы для удобства
        System.out.println(result);
    }


}