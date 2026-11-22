interface Animal {

    void makeSound();

    void move();

    void displayInfo();
}

class Dog implements Animal {

    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    @Override
    public void move() {
        System.out.println("The dog walks.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Bird implements Animal {

    protected String name;
    protected int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet Tweet!");
    }

    @Override
    public void move() {
        System.out.println("The bird flies.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Dog("Rex", 3);
        Animal a2 = new Bird("Tweety", 1);

        a1.displayInfo();
        a1.makeSound();
        a1.move();

        System.out.println("-----------");

        a2.displayInfo();
        a2.makeSound();
        a2.move();
    }
}