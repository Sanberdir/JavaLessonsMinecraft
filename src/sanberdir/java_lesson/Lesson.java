package sanberdir.java_lesson;

public class Lesson {

    public static void main(String[] arguments) {

        String[] questions = new String[4];
        questions[0] = "Что означает WWW?";
        questions[1] = "Какой океан является самым большим в мире?";
        questions[2] = "В каком году объединились Восточная и Западная Германия?";
        questions[3] = "Какова столица Франции?";

        String[] answers = new String[4];
        answers[0] = "Всемирная паутина";
        answers[1] = "Тихий океан";
        answers[2] = "1990";
        answers[3] = "Париж";

        outputQuestionsAndAnswersXTimes(5, questions, answers);
        System.out.println("----");
        outputQuestionsAndAnswersXTimes(2, questions, answers);
        System.out.println("----");
        outputQuestionsAndAnswersXTimes(3, questions, answers);
        System.out.println("----");
        outputQuestionsAndAnswersXTimes(8, questions, answers);
        System.out.println(sum(7,8));
    }
    private static void outputQuestionsAndAnswersXTimes(int x, String[] questions, String[] answers) {
        for (int c = 0; c < x; c++) {
            outputQuestionsAndAnswers(questions, answers);
        }
    }

    public static void outputQuestionsAndAnswers (String[] questions, String[] answers) {
        for(int i = 0; i < questions.length; i++) {
            System.out.println("Q: " + questions[i] + " | A: " + answers[i]);
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}