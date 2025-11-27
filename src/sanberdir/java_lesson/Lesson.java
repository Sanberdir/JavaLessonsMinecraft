package sanberdir.java_lesson;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] arguments) {
        String name = "Kaupenjoe";
        String occupation = "YouTube";

        occupation = occupation + "r";

        System.out.println("Меня зовут " + name + " и я " + occupation);


        String sentence = "Привет, чем ты занят?";
        System.out.println(sentence);

        // Верхний регистр или нижний регистр
        System.out.println("Нижний регистр: " + sentence.toLowerCase());
        System.out.println("Верхний регистр: " + sentence.toUpperCase());

        // Содержит ли строка
        System.out.println("Содержит ли строка \"Howdy\": " + sentence.contains("Howdy"));

        // Замена
        System.out.println(sentence.replace("Привет", "Howdy"));

        // Символ по индексу
        System.out.println(sentence.charAt(5));

        // Исходная строка не изменяется
        System.out.println(sentence);

        Scanner scan = new Scanner(System.in);
        String test = scan.next();

        System.out.println(test.equals("Привет"));
    }
}