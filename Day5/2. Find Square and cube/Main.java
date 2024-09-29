import java.util.*;

public class Main {
    public static double FindSquare(double n){
        return n*n;
    }
    public static double FindCube(double n){
        return n*n*n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        double h=Double.parseDouble(sc.nextLine());
        double sq=FindSquare(h);
        double cu=FindCube(h);
        System.out.println("Square of "+h+" is "+sq);
        System.out.println("Cube of "+h+" is "+cu);
    }
}

