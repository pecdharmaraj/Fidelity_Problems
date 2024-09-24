import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Superclass

// Main class


public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=Integer.parseInt(sc.nextLine());
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            int n=Integer.parseInt(sc.nextLine());
            arr.add(n);
        }
        int s=0;
        for(Integer j:arr){
            if(j%2==0){
                s+=j;
            }
        }
        System.out.println("Sum of even numbers"+s);


    }
}