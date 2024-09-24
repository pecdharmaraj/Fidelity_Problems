import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Superclass

// Main class


public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=Integer.parseInt(sc.nextLine());
        if(k>=18){
            System.out.println("Right To Vote");
        }
        else{
            System.out.println("Not Eligible To Vote");
        }

    }
}