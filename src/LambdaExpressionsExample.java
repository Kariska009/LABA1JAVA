// Создаем функциональный интерфейс с одним абстрактным методом
@FunctionalInterface
interface Operation009 {
    int execute(int a, int b, int c);
}

public class LambdaExpressionsExample {
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
        Operation isPrime = (a, b, c) -> {

            int temp = 0;
            boolean result4 = true;

            for (int j = 2;  a >= j; j++) {
                temp = a % j;
                if (temp == 0) {
                    result4 = false;
                    break;
                }

            }

            return temp;
        };

        // Вызываем и тестируем лямбда-выражения
        int result1 = sum.execute(5, 7, 9);
        int result2 = product.execute(2, 3, 4);
        int result3 = factorial.execute(5, 0, 0);
        int result4 = isPrime.execute(7, 0, 0);

        System.out.println("Сумма: " + result1);
        System.out.println("Произведение: " + result2);
        System.out.println("Факториал: " + result3);
        System.out.println("Простое число: " + result4);
    }
}

