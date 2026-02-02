package sanberdir.java_lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* УПРАЖНЕНИЕ 3 - Калькулятор с классами
         * Создайте такое же приложение-калькулятор, как и раньше!
         * На этот раз создайте классы для каждой операции. Создайте пользовательский интерфейс, который будут реализовывать все эти классы!
         * Также создайте класс Calculator, который будет заниматься самим вычислением.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("plus or + for Addition");
        System.out.println("minus or - for Subtraction");
        System.out.println("multiply or * for Multiplication");
        System.out.println("divide or / for Division");

        System.out.print("Enter the operation: ");
        String choice = scanner.nextLine();

        Operation selectedOperation;
        switch (choice.toLowerCase()) {
            case "plus", "+":
                selectedOperation = new Addition();
                break;
            case "minus", "-":
                selectedOperation = new Subtraction();
                break;
            case "multiply", "*":
                selectedOperation = new Multiplication();
                break;
            case "divide", "/":
                selectedOperation = new Division();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        Calculator calculator = new Calculator(selectedOperation);

        System.out.print("Enter First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = scanner.nextInt();

        int result = calculator.calculate(firstNumber, secondNumber);
        System.out.println(calculator.getOperationString() + " = " + result);
    }
}