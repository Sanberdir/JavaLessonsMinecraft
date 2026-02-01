package sanberdir.java_lesson;

import java.util.*;

public class Lesson {

    public static void main(String[] args) {


        Animal bengie = new Dog("bengie.png", "Bengie", 9);
        Animal jeremy = new Dog("jeremy.png", "Jeremy", 7);

        Animal whiskers = new Cat("whiskers.jpg", "Whiskers", 5);

        Animal george = new Cat("george.jpg", "George", 3);

        Bird jules = new Bird("jules.png", "Jules", 1);
        /*Анонимные классы*/
        Animal joel = new Animal("joel.png","joel",1) {

            @Override
            public void move() {
                System.out.println("Хомячок бежит");
            }

            @Override
            public void makeSound() {
                System.out.println("Хомячок пищит");
            }
        };

        jules.move();
        jules.fly();

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(whiskers);
        animals.add(jules);
        animals.add(joel);

        List<IFlyable> flyables = new ArrayList<>();
        flyables.add(jules);
        flyables.add(new Aeroplane());

        for (Animal animal : animals) {
            animal.move();
            animal.makeSound();
        }

        for(IFlyable flyable : flyables) {
            flyable.fly();
        }
    }
}