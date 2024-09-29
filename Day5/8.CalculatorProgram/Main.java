import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operator: ");
        char c=sc.nextLine().charAt(0);
        System.out.println("Enter the operands: ");
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());
        switch(c){
            case '+':
                System.out.println("Result of "+a+c+" "+b+" is "+(a+b));
                break;
            case '-':
                System.out.println("Result of "+a+c+" "+b+" is "+(a-b));
                break;
            case '*':
                System.out.println("Result of "+a+c+" "+b+" is "+(a*b));
                break;
            case '/':
                System.out.println("Result of "+a+c+" "+b+" is "+(a/b));
                System.out.println("Remainder = "+(a%b));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}

