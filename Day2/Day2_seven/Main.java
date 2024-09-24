import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}
// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}
// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}
// Main class

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}