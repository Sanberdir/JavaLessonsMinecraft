package sanberdir.java_lesson;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] arguments) {
        /* МАССИВЫ */

        String question1 = "Сколько штатов в США?";
        String question2 = "Какова столица Великобритании?";
        String question3 = "Какой химический символ у железа?";

        String answer1 = "50";
        String answer2 = "Лондон";
        String answer3 = "Fe";

        String[] questions = new String[3];
        questions[0] = "Сколько штатов в США?";
        questions[1] = "Какова столица Великобритании?";
        questions[2] = "Какой химический символ у железа?";

        String[] answers = new String[3];
        answers[0] = "50";
        answers[1] = "Лондон";
        answers[2] = "Fe";

        System.out.println(questions[0]);
        System.out.println(answers[0]);

        questions[0] = "Сколько лет Юэну Макгрегору (в 2021 году)?";
        System.out.println(questions[0]);
        System.out.println(answers[0]);
        // Вывод длины массива
        System.out.println(questions.length);

        // ArrayIndexOutOfBoundsException (Раскомментируйте строку ниже)
        // System.out.println(questions[3]);

    }
}