import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Superclass

// Main class


public class Main {
    public static List<Integer> arrayGenerator(int n){
        List<Integer> x=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            int k=Integer.parseInt(sc.nextLine());
            x.add(k);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
       //1ST PROBLEM
        List<Integer> arr=arrayGenerator(n);
        double average=0;
        for(Integer temp:arr){
            average+=temp;
        }
        average=average/n;
        System.out.println(average);

    }
}