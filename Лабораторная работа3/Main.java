public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        // Создаем студентов
        Student student1 = new Student("Иван", "Иванов", 20, 4.5);
        Student student2 = new Student("Петр", "Петров", 21, 3.8);
        Student student3 = new Student("Сергей", "Аминьев", 21, 5.0);
        Student student4 = new Student("Максим", "Пеструхин", 19, 3.2);
        Student student5 = new Student("Анна", "Петрова", 22, 3.8);
        Student student6 = new Student("Сергей", "Сидоров", 19, 4.0);
        Student student7 = new Student("Мария", "Кузнецова", 21, 4.7);
        Student student8 = new Student("Дмитрий", "Федоров", 23, 3.5);
        Student student9 = new Student("Елена", "Морозова", 20, 4.2);
        Student student0 = new Student("Алексей", "Семенов", 18, 4.1);

        // Вставка студента
        hashTable.put("123456", student1);
        hashTable.put("654321", student2);
        hashTable.put("349818", student3);
        hashTable.put("112397", student4);
        hashTable.put("112398", student5);
        hashTable.put("112399", student6);
        hashTable.put("112400", student7);
        hashTable.put("112401", student8);
        hashTable.put("112402", student9);
        hashTable.put("112403", student0);

        // Поиск студента
        Student foundStudent = hashTable.get("123456");
        System.out.println(foundStudent + " " + "Удален из таблицы"); // Вывод информации о студенте
        // Удаление студента
        hashTable.remove("654321");

        // Проверка размера хэш-таблицы
        System.out.println("Количество студентов " + hashTable.size());
    }
}