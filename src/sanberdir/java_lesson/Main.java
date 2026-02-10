package sanberdir.java_lesson;

public class Main {
    public static void main(String[] args) throws Exception {
        int x = 10;
        try {
            float a = 100 / 0;
        } catch (Exception e) {
            System.out.println("Это счастливое исключение " + e.getMessage());
        }
        System.out.println("I am happy!");
        if (x < 100) {
            throw new Exception("Это просто изумительно!");
        }
    }
}