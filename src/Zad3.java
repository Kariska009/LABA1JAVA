import java.util.function.BinaryOperator;

public class Zad3 {
    public static void main(String[] args) {
        // Лямбда-выражение для поиска максимума из трех объектов
        BinaryOperator<Integer> max = (a, b) -> Math.max(a, b);
        BinaryOperator<Integer> maxOfThree = (a, b) -> Math.max(a, max.apply(a, b));

        int resultMax = maxOfThree.apply(10, 5); // Пример использования
        System.out.println("Максимум из трех объектов: " + resultMax);

        // Лямбда-выражение для поиска минимума из трех объектов
        BinaryOperator<Integer> min = (a, b) -> Math.min(a, b);
        BinaryOperator<Integer> minOfThree = (a, b) -> Math.min(a, min.apply(a, b));

        int resultMin = minOfThree.apply(10, 5); // Пример использования
        System.out.println("Минимум из трех объектов: " + resultMin);
    }
}