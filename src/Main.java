// Создаем функциональный интерфейс с одним абстрактным методом
@FunctionalInterface
interface Operation {
    int execute(int a, int b, int c);

}
interface PrimeChecker {
    boolean isPrime(int n);
}

public class Main {
    public static void main(String[] args) {
        // Лямбда-выражение для подсчета суммы трех целых чисел
        Operation sum = (a, b, c) -> a + b + c;

        // Лямбда-выражение для подсчета произведения трех целых чисел
        Operation product = (a, b, c) -> a * b * c;

        // Лямбда-выражение для вычисления факториала числа
        Operation factorial = (a, b, c) -> {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result *= i;
            }
            return result;
        };

        // Лямбда-выражение для проверки, является ли число простым
        PrimeChecker primeChecker = (n) -> {

            int temp = 0;
            boolean result4 = true;

            for (int j = 2;  n >= j; j++) {
                temp = n % j;
                if (temp == 0) {
                    result4 = false;
                    break;
                }

            }
            return result4;
        };

        // Вызываем и тестируем лямбда-выражения
        int result1 = sum.execute(5, 7, 9);
        int result2 = product.execute(2, 3, 4);
        int result3 = factorial.execute(5, 0, 0);
        boolean result4 = primeChecker.isPrime(17);


        System.out.println("Сумма: " + result1);
        System.out.println("Произведение: " + result2);
        System.out.println("Факториал: " + result3);
        System.out.println("Простое число: " + result4);
    }
}