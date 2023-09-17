import java.util.Arrays;
import java.util.Comparator;

public class Zad4 {
    public static <T> T findMax(T... elements) {
        if (elements == null || elements.length == 0) {
            throw new IllegalArgumentException("Массив элементов пуст или равен null");
        }

        return Arrays.stream(elements)
                .max((Comparator<? super T>) Comparator.naturalOrder().reversed())
                .orElse(null);
    }

    public static void main(String[] args) {
        Integer maxInteger = findMax(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5); // Пример для целых чисел
        System.out.println("Максимальное целое число: " + maxInteger);

        Double maxDouble = findMax(3.14, 2.71, 1.618, 2.718, 3.141); // Пример для чисел с плавающей точкой
        System.out.println("Максимальное число с плавающей точкой: " + maxDouble);

        String maxString = findMax("apple", "banana", "cherry", "date"); // Пример для строк
        System.out.println("Максимальная строка: " + maxString);
    }
}