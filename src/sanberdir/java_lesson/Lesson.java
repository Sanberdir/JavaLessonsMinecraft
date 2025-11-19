package sanberdir.java_lesson;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] arguments) {
        /*
         * ЛОГИЧЕСКИЕ ПЕРЕМЕННЫЕ И ОПЕРАЦИИ В JAVA
         * Boolean - тип данных, который может быть либо true (истина), либо false (ложь)
         */

// Объявление логических переменных
        boolean goodVideo = true;        // Это хорошее видео - ДА
        boolean subscribed = false;      // Подписан - НЕТ
        System.out.println("Это хорошее видео: " + goodVideo);

        boolean isCreative = false;
        System.out.println("Игрок в творческом режиме: " + isCreative);

// -------------------------------
// ОПЕРАЦИИ СРАВНЕНИЯ
// -------------------------------
        /*
         * >   - больше
         * <   - меньше
         * >=  - больше или равно
         * <=  - меньше или равно
         * ==  - равно
         * !=  - не равно
         */

        int points = 47;
        int pointsToPass = 55;

// Проверяем, набрал ли достаточно баллов для прохождения
        boolean hasPassedTest = points >= pointsToPass; // Больше или равно
        System.out.println("Прошел тест: " + hasPassedTest); // false (47 < 55)

        int health = 0;
// Проверяем, жив ли игрок (здоровье больше 0)
        boolean isAlive = health > 0;
        System.out.println("Игрок Kaupenjoe еще жив? " + isAlive); // false

// Примеры сравнений
        boolean  test= 100 == 100; // true - 100 равно 100
        test = 100 != 100;         // false - 100 не равно 100? НЕТ!

// -------------------------------
// ЛОГИЧЕСКИЕ ОПЕРАТОРЫ (AND, OR, NOT)
// -------------------------------

        /*
         * ЛОГИЧЕСКОЕ ИЛИ (OR) - оператор ||
         *
         * a | b | a || b
         * 0 | 0 |   0
         * 1 | 0 |   1
         * 0 | 1 |   1
         * 1 | 1 |   1
         *
         * Результат true если ХОТЯ БЫ один операнд true
         */

        /*
         * ЛОГИЧЕСКОЕ И (AND) - оператор &&
         *
         * a | b | a && b
         * 0 | 0 |   0
         * 1 | 0 |   0
         * 0 | 1 |   0
         * 1 | 1 |   1
         *
         * Результат true только если ОБА операнда true
         */

        /*
         * ЛОГИЧЕСКОЕ НЕ (NOT) - оператор !
         *
         * a | !a
         * 0 |  1
         * 1 |  0
         *
         * Инвертирует значение (true становится false, false становится true)
         */

// Пример: получение почестей (требует сдачи обоих тестов)
        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest1 && passedTest2; // true только если ОБА true!
        System.out.println("Получил почести: " + hasHonors); // true

// -------------------------------
// ПРАКТИЧЕСКИЙ ПРИМЕР: ПРОВЕРКА ВОЗРАСТА ДЛЯ АЛКОГОЛЯ
// -------------------------------

        Scanner scanner = new Scanner(System.in);

// Запрашиваем возраст у пользователя
        System.out.println("Сколько вам лет?");
        int age = scanner.nextInt();

// Спрашиваем, из Европы ли пользователь
        System.out.println("Введите true или false, вы из Европы?");
        boolean isEuropean = scanner.nextBoolean();

// Устанавливаем возрастные ограничения
        int euDrinkingAge = 18;  // Возраст для Европы
        int usDrinkingAge = 21;  // Возраст для США

        /*
         * Логика проверки:
         * Может пить если:
         * - Из Европы И возраст >= 18 ЛИБО
         * - Не из Европы И возраст >= 21
         */
        boolean canDrink = isEuropean && age >= euDrinkingAge || !isEuropean && age >= usDrinkingAge;
        System.out.println("Можно вам пить алкоголь? " + canDrink);

        /*
         * РАЗБОР ЛОГИЧЕСКОГО ВЫРАЖЕНИЯ НА ПРИМЕРАХ:
         *
         * Пример 1: Европеец, 20 лет
         * isEuropean = true, age = 20
         * true && (20 >= 18) || false && (20 >= 21)
         * true && true || false && false
         * true || false = true ✓
         *
         * Пример 2: Не европеец, 20 лет
         * isEuropean = false, age = 20
         * false && (20 >= 18) || true && (20 >= 21)
         * false && true || true && false
         * false || false = false ✗
         *
         * Пример 3: Не европеец, 25 лет
         * isEuropean = false, age = 25
         * false && (25 >= 18) || true && (25 >= 21)
         * false && true || true && true
         * false || true = true ✓
         */

        scanner.close(); // Не забываем закрыть Scanner!
    }
}