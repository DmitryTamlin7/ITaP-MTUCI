//Задание 5: Поиск всех слов, начинающихся с заданной буквы
//Необходимо написать программу, которая будет искать все слова в
//заданном тексте, начинающиеся с заданной буквы, и выводить их на
//экран. При этом программа должна использовать регулярные выражения
//для поиска слов и обрабатывать возможные ошибки.

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StartUpp {
    public static void main(String[] args) {
        String text = "Hello. My name is Anton. My famous sport is Football";
        Pattern pattern = Pattern.compile("\\s\\b[A-Z][a-z]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
