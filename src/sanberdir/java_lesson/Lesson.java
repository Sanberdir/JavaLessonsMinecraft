package sanberdir.java_lesson;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] arguments) {
        /* УПРАЖНЕНИЕ 1: Простой Калькулятор
         *
         * Создайте калькулятор, который работает многократно до тех пор,
         * пока вы вручную не завершите его.
         * Сначала нужно прочитать операцию, затем первое и второе число.
         *
         * В зависимости от выбранной операции, вы должны вернуть разный результат.
         * Это можно сделать с помощью операторов if или switch.
         *
         * Обратите внимание: при чтении строки нужно использовать scanner.next()
         * И при сравнении строк используйте:
         * String s = "something";
         * s.equals("something");
         * а не ==
         *
         * После вывода результата спросите пользователя, хочет ли он продолжить,
         * если нет - завершите программу!
         * Примерное время выполнения: 30-45 минут
         *
         */

// Создаем сканер для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

// Бесконечный цикл while(true) - будет работать, пока мы не прервем его break
        while(true) {
            // Просим пользователя ввести математическую операцию
            System.out.println("Type in the operation (plus or +, minus or -, multiply or *, divide or /)");
            // Читаем введенную операцию как строку
            String operation = scanner.next();

            // Запрашиваем первое число
            System.out.println("Type in your first number!");
            // Читаем первое число как целое число
            int number1 = scanner.nextInt();

            // Запрашиваем второе число
            System.out.println("Type in your second number!");
            // Читаем второе число как целое число
            int number2 = scanner.nextInt();

            // Переменная для хранения результата вычислений
            int result = 0;

            // Конструкция SWITCH для выбора операции
            // В Java 14+ можно использовать несколько значений в case через запятую
            switch (operation) {
                // Если операция "plus" или "+" - выполняем сложение
                case "plus", "+":
                    result = number1 + number2;
                    break;

                // Если операция "minus" или "-" - выполняем вычитание
                case "minus", "-":
                    result = number1 - number2;
                    break;

                // Если операция "multiply" или "*" - выполняем умножение
                case "multiply", "*":
                    result = number1 * number2;
                    break;

                // Если операция "divide" или "/" - выполняем деление
                case "divide", "/":
                    result = number1 / number2;
                    break;

                // Если операция не распознана - результат 0
                default:
                    result = 0;
                    break;
            }

            // Выводим красивую строку с результатом вычислений
            System.out.println("Your result it " + number1 + " " + operation + " " + number2 + " = " + result);

            // Спрашиваем пользователя, хочет ли он продолжить
            System.out.println("\nDo you wish to calculate something else? y/n");

            // Проверяем ответ пользователя
            // scanner.next() читает следующий ввод
            // !scanner.next().equals("y") - если ввод НЕ равен "y"
            if(!scanner.next().equals("y")) {
                // Прерываем цикл break, если пользователь ввел не "y"
                break;
            }
            // Если пользователь ввел "y", цикл продолжается с начала
        }
    }
}