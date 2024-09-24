import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Shape {
    public void display() {
        System.out.println("Inside display");
    }
}
class Rectangle extends Shape {
    public void area() {
        System.out.println("Inside area");
    }
}
class Cube extends Rectangle {
    public void volume() {
        System.out.println("Inside volume");
    }
}
public class Main {
    public static void main(String[] args) {

        Cube cube = new Cube();
        cube.display();
        cube.area();
        cube.volume();

    }
}