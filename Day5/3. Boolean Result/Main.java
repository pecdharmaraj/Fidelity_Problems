import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your value for x : ");
        int x=Integer.parseInt(sc.nextLine());
        System.out.println("Enter your value for y : ");
        int y=Integer.parseInt(sc.nextLine());
        boolean result=(x>y);
        if(result==false && x==y){
            System.out.println("Both are x and y have same value");
        }else if(result==false){
            System.out.println("x<y");
        }
        else{
            System.out.println("x>y");
        }

    }
}

