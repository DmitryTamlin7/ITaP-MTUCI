//Задание 4: Проверка корректности ввода IP-адреса
//Необходимо написать программу, которая будет проверять корректность
//ввода IP-адреса. IP-адрес должен состоять из 4 чисел, разделенных
//точками, и каждое число должно быть в диапазоне от 0 до 255. При этом
//программа должна использовать регулярные выражения для проверки
//IP-адреса и обрабатывать возможные ошибки.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPtrue {
    public static void main(String[] args){
        String text = "192.168.1.1";
        if (IPcorrect(text)){
            System.out.println("IP Адрес коректный");
        }else {
            System.out.println("Ошибка ввода IP Адресса");
        }
    }
    public static boolean IPcorrect(String ipAddress) {
        String ipAddressRegex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(ipAddressRegex);
        Matcher matcher = pattern.matcher(ipAddress);

        return matcher.matches();
    }
}


