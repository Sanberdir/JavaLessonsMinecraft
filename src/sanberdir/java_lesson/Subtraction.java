package sanberdir.java_lesson;

public class Subtraction implements Operation {
    @Override
    public int perform(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public char getOperationSymbol() {
        return '-';
    }
}
