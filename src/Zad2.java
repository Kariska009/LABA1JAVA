import java.util.Arrays;

public class Zad2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Проверка на четность
        int sumEven = sumArrayElements(numbers, (num) -> num % 2 == 0);
        System.out.println("Сумма четных чисел: " + sumEven);

        // Проверка на нечетность
        int sumOdd = sumArrayElements(numbers, (num) -> num % 2 != 0);
        System.out.println("Сумма нечетных чисел: " + sumOdd);

        // Число находится в диапазоне от A до B
        int a = 3;
        int b = 7;
        int sumInRange = sumArrayElements(numbers, (num) -> num >= a && num <= b);
        System.out.println("Сумма чисел в диапазоне от " + a + " до " + b + ": " + sumInRange);

        // Проверка на кратность параметру A
        int paramA = 3;
        int sumMultipleOfA = sumArrayElements(numbers, (num) -> num % paramA == 0);
        System.out.println("Сумма чисел, кратных " + paramA + ": " + sumMultipleOfA);
    }

    public static int sumArrayElements(int[] arr, IntPredicate condition) {
        return Arrays.stream(arr)
                .filter(condition::test)
                .sum();
    }

    interface IntPredicate {
        boolean test(int num);
    }
}
