package sanberdir.java_lesson;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] arguments) {
        /* ВВОД И ВЫВОД ДАННЫХ */

        /* ВЫВОД ДАННЫХ */
        // Вывод строки в консоль SOUT
        System.out.println("Привет, я Нико! И это введение в Java для моддинга в Minecraft!");

        // Также можно выводить переменные (будет выведено их ЗНАЧЕНИЕ)
        int life = 42;
        System.out.println(life);

        // Можно комбинировать строки и переменные с помощью конкатенации (сложения строк)
        int grade = 80;
        System.out.println("Твоя оценка: " + grade);


        /* ВВОД ДАННЫХ */
        // Создаем объект Scanner для чтения ввода из консоли
        // System.in - стандартный поток ввода (клавиатура)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        // Чтение целого числа - следующий ввод ДОЛЖЕН БЫТЬ ЧИСЛОМ!
        int number = scanner.nextInt();
        System.out.println("Вы только что ввели: " + number);

        // Очистка буфера после nextInt() - очень важно!
        // nextInt() не потребляет символ новой строки, поэтому нам нужно его "прочитать"
        scanner.nextLine();
        System.out.println("Введите текст");
        // Чтение целой строки (все что ввели до нажатия Enter)
        String input = scanner.nextLine();
        System.out.println("Вы теперь ввели (строку): " + input);

        // Закрываем Scanner чтобы освободить ресурсы (хорошая практика)
        scanner.close();
    }
}