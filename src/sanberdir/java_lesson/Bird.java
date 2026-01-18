package sanberdir.java_lesson;

public class Bird extends Animal implements IFlyable{
    public Bird(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Поёт");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
