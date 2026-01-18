package sanberdir.java_lesson;

public class Cat extends Animal {
    public Cat(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void move() {
        System.out.println("Кошка крадётся");
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }
}
