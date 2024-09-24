import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Person p1=new Person();
      p1.setName("Abishek");
      p1.gender="Male";
      p1.age=23;
      Person p2=new Person();
      p2.setName("Ruban");
      p2.gender="Male";
      p2.age=22;
      System.out.println(p1.toString());
      System.out.println(p2.toString());


    }
}