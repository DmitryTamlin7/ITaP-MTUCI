//Задание 2: Проверка корректности ввода пароля
//Необходимо написать программу, которая будет проверять корректность
//ввода пароля. Пароль должен состоять из латинских букв и цифр, быть
//длиной от 8 до 16 символов и содержать хотя бы одну заглавную букву и
//одну цифру. При этом программа должна использовать регулярные
//выражения для проверки пароля и обрабатывать возможные ошибки.
import java.util.regex.*;


public class PassTrue {
    public static void main(String[] args){
        String pass = "Scwiki5i123"; // верно
//        String pass1 = "scwikiki763"; // неверно
//        String pass2 = "Scwlkwikiki"; // неверно
//        String pass3 = "S3iki"; // неверно
        System.out.println(validatePassword(pass));

    }
    public static String validatePassword(String pass){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$");
        Matcher matcher = pattern.matcher(pass);
        if (matcher.matches()){
            return "Пароль принят";
        } else {
            StringBuilder errorMessage = new StringBuilder("Пароль не соответствует требованиям");
            return errorMessage.toString();
        }
    }
}
