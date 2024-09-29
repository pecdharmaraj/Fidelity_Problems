
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName=sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName=sc.nextLine();
        System.out.println("Enter date of birth in yyyy/mm/dd :");
        String doe=sc.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate birthDate=LocalDate.parse(doe,formatter);
        LocalDate currentDate=LocalDate.now();
        Period age=Period.between(birthDate,currentDate);
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Age: "+age.getYears());
        if(age.getYears()>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Child");
        }

    }
}

