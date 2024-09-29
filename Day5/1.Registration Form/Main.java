import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s=sc.nextLine();
        System.out.print("Enter the age : ");
        int a=Integer.parseInt(sc.nextLine());
        System.out.print("Enter your country :");
        String con=sc.nextLine();
        System.out.println("Welcome "+s+". "+"Your age is "+a+" and you are from "+con);
    }
}

