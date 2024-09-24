import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Superclass

// Main class
class Vehicle{
    public String registrationNumber;
    public String brand;
    public Vehicle(String registrationNumber,String brand)
    {
        this.registrationNumber=registrationNumber;
        this.brand=brand;
    }
}
class Car extends Vehicle{
    private int numDoors;
    public Car(String registration,String brand,int numDoors){
        super(registration,brand);
        this.numDoors=numDoors;
    }
    public int parkingFee(){
        return 30;
    }
    public void displayDetails(){
        System.out.println("Car Registration: "+registrationNumber+", Brand: "+brand+", Number of Doors: "+numDoors);
    }
}
class Motorcycle extends Vehicle{
    private String engineType;
    public Motorcycle(String registration,String brand,String engineType){
        super(registration,brand);
        this.engineType=engineType;
    }
    public int parkingFee(){
        return 5;
    }
    public void displayDetails(){
        System.out.println("Motorcycle Registration: "+registrationNumber+", Brand: "+brand+", EngineType: "+engineType);
    }
}


public class Main {
    public static void main(String[] args) {
       Car obj=new Car("TN12X1000","BMW",4);
       obj.displayDetails();
       System.out.println("Parking Fee for car: "+obj.parkingFee());
       Motorcycle obj1=new Motorcycle("TN12Y1230","Ducati","FireForce");
       obj1.displayDetails();
       System.out.println("Parking fee for motorcycle: "+obj1.parkingFee());

    }
}