package sanberdir.java_lesson;

public class Dog extends Animal {
    public Dog(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void move() {
        System.out.println("Собака бежит");
    }

    @Override
    public void makeSound() {
        System.out.println("Тяв");
    }
}
