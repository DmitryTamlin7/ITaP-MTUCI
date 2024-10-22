 public class ArrayAverage {
        public static void main(String[] args) {
            int [] arr = {1, 2, 3, 4, 5 };
            int sum = 0;

            try {
                // Обработка массива
                for (int i = 0; i <= arr.length - 1; i++) { // чистый код
                    sum += arr[i];
                }

//               for (int i = 0; i <= arr.length; i++) { // Ошибка: выход за границы массива
//                    sum += arr[i];
//                }
                double average = (double) sum / arr.length;
                System.out.println("Среднее арифметическое: " + average);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: Выход за границы массива. Проверьте индекс.");
            } catch (Exception e) {
                System.out.println("Ошибка: Произошла непредвиденная ошибка - " + e.getMessage());
            }
        }
    }

