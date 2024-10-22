import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "/Users/admin/Desktop/Университет/3 Cеместр/ИТиП/Лабораторные работы/Лабораторная работа 4/Labs4/file1.txt"; // Путь к исходному файлу

        String destinationFile = "/Users/admin/Desktop/Университет/3 Cеместр/ИТиП/Лабораторные работы/Лабораторная работа 4/Labs4/file2.txt"; // Путь к целевому файлу

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Копирование завершено успешно.");

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}
