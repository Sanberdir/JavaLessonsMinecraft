package sanberdir.java_lesson;

public class Dog {
    public String picture;
    protected String name;
    private int age;

    public static int numberOfDogs = 0;
    // Default Constructor
    // public Dog() {
    //
    // }

    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;

        numberOfDogs++;
    }

    public void birthday() {
        age++;
    }

    // Getter
    public int getAge() {
        return age;
    }

    //Setter
    public void setAge(int age) {
        this.age = age;
    }
}
