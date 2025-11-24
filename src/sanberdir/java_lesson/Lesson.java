package sanberdir.java_lesson;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] arguments) {
        /* УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ (IF И SWITCH) */
// Эти конструкции позволяют программе принимать решения
// и выполнять разные действия в зависимости от условий

// Создаем сканер для чтения ввода пользователя с клавиатуры
        Scanner scanner = new Scanner(System.in);

// Запрашиваем у пользователя количество здоровья
        System.out.println("How much Health do you have?");
// Читаем введенное число и сохраняем в переменную health
        int health = scanner.nextInt();

// Создаем булеву переменную isAlive (жив ли персонаж)
// Проверяем, больше ли здоровья чем 0
        boolean isAlive = health > 0;

// Конструкция IF-ELSE - проверяет условие и выполняет соответствующий блок кода
        if (isAlive) {
            // Этот блок выполнится, если условие isAlive истинно (true)
            // То есть если health > 0
            System.out.println("You are still alive!");
        } else {
            // Этот блок выполнится, если условие isAlive ложно (false)
            // То есть если health <= 0
            System.out.println("You have lost the game!");
        }

// Запрашиваем у пользователя количество очков
        System.out.println("How many points do you have?");
// Читаем введенное число и сохраняем в переменную points
        int points = scanner.nextInt();

// Конструкция IF-ELSE IF-ELSE с несколькими условиями
        if (points >= 100) {
            // Выполнится, если points больше или равно 100
            System.out.println("You passed with HONORS!");
        } else if (points >= 50) {
            // Выполнится, если первое условие ложно, но points >= 50
            // То есть points от 50 до 99
            System.out.println("You passed");
        } else {
            // Выполнится, если все предыдущие условия ложны
            // То есть points меньше 50
            System.out.println("You failed!");
        }

// КОНСТРУКЦИЯ SWITCH
// Используется для выбора одного варианта из многих возможных
// Создаем переменную level (уровень) со значением 3
        int level = 3;

// Начинаем конструкцию switch, передаем переменную для проверки
        switch (level) {
            // case - варианты выбора
            case 0:
                // Выполнится, если level равен 0
                System.out.println("X is 0");
                break; // break прерывает выполнение switch

            case 1:
                // Выполнится, если level равен 1
                System.out.println("X is 1");
                break;

            case 2:
                // Выполнится, если level равен 2
                System.out.println("X is 2");
                break;

            case 3:
                // Выполнится, если level равен 3
                // В нашем случае level = 3, поэтому выполнится этот блок
                System.out.println("X is 3");
                break;

            default:
                // Выполнится, если ни один case не совпал
                // Это необязательный блок (как else в if)
                System.out.println("X is unknown!");
                break;
        }
    }
}