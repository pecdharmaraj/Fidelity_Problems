import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Superclass

// Main class

class AreaCalculator{
    public double Area(double radius,boolean isCircle){
        double a1=(3.14)*(radius)*(radius);
        return a1;
    }
    public double Area(double length,double width){
        double a1=(length*width);
        return a1;
    }
    public double Area(double side){
        double a1=(side*side);
        return a1;
    }
}
public class Main {
    public static void main(String[] args) {
       AreaCalculator obj=new AreaCalculator();
       double circle=obj.Area(3,true);
       System.out.println("Area of circle: "+circle);
       double rectangle=obj.Area(4,6);
       System.out.println("Area of Rectangle: "+rectangle);
       double square=obj.Area(5);
       System.out.println("Area of Square: "+square);

    }
}