abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract methods
    public abstract void makeSound();

    public abstract void move();

    // Regular method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }

    @Override
    public void move() {
        System.out.println("The dog walks.");
    }
}



class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet Tweet!");
    }

    @Override
    public void move() {
        System.out.println("The bird flies.");
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