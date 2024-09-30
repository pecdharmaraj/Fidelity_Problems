import java.util.*;
import java.util.stream.Collectors;
class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Prog{
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>(Arrays.asList(
                new Employee(1,"Abi",50000),
                new Employee(2,"ruban",60000),
                new Employee(3,"kumar",70000),
                new Employee(4,"vijay",80000),
                new Employee(5,"Archana",90000)

        ));
        List<Employee> filterEmployees=employees.stream().filter(employee -> employee.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println("Employee whose names start with 'A':");
        filterEmployees.forEach(System.out::println);
    }
}
