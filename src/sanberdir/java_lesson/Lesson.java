package sanberdir.java_lesson;

public class Lesson {

    public static void main(String[] arguments) {
        /* ПРИВЕДЕНИЕ ТИПОВ (CASTING) */
// Приведение типов - это преобразование одного типа данных в другой

// Создаем переменные разных типов
        int health = 10;          // целое число
        float damage = 1.5f;      // дробное число

// Проблема: нельзя присвоить float к int без явного преобразования
// int result = health - damage; // ОШИБКА компиляции! Типы не совместимы

// НЕЯВНОЕ ПРИВЕДЕНИЕ (automatic casting)
// Java автоматически преобразует int в float при операции между разными типами
        float resultFloat = health - damage; // health (10) неявно преобразуется в 10.0f
        System.out.println("Результат: " + resultFloat); // Выведет: Результат: 8.5

// ЯВНОЕ ПРИВЕДЕНИЕ (explicit casting) - float к int
// (int)damage - явно преобразует damage из float в int, отбрасывая дробную часть
        int resultInteger = health - (int)damage; // 1.5 становится 1
        System.out.println("Результат: " + resultInteger); // Выведет: Результат: 9

// Комбинированное явное приведение
// Сначала преобразуем health во float, затем после вычисления преобразуем результат в int
        resultInteger = (int)((float)health - damage); // 10.0 - 1.5 = 8.5, затем 8.5 -> 8
        System.out.println("Результат: " + resultInteger); // Выведет: Результат: 8

// ПРИВЕДЕНИЕ СТРОК К ЧИСЛАМ
        String point = "100"; // строка содержащая число
        System.out.println("Результат: " + point + 5); // Выведет: Результат: 1005
// Конкатенация строк! "100" + "5" = "1005"

// Преобразование строки в целое число с помощью Integer.parseInt()
        int result = Integer.parseInt(point) + 5; // "100" -> 100, затем 100 + 5
        System.out.println("Результат: " + result); // Выведет: Результат: 105

// ДОПОЛНИТЕЛЬНЫЕ ПРИМЕРЫ:

// Приведение double к int (потеря дробной части)
        double price = 19.99;
        int wholePrice = (int)price;
        System.out.println("Цена без копеек: " + wholePrice); // Выведет: Цена без копеек: 19

// Приведение int к double (без потерь)
        int count = 5;
        double total = count; // Неявное приведение int к double
        System.out.println("Общее количество: " + total); // Выведет: Общее количество: 5.0

// Преобразование числа в строку
        int score = 95;
        String scoreText = String.valueOf(score); // или Integer.toString(score)
        System.out.println("Счёт: " + scoreText + " очков"); // Выведет: Счёт: 95 очков
    }
}