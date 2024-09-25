import java.util.*;

class Employee {
    protected int employeeId;
    protected String name;
    protected float basicSalary;
    protected float bonus;
    protected float netSalary;

    public Employee(int employeeId, String name, float basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void displayDetails() {
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }
}

class PermanentEmployee extends Employee {
    private int pf;

    public PermanentEmployee(int employeeId, String name, float basicSalary, int pf) {
        super(employeeId, name, basicSalary);
        this.pf = pf;
        calculateSalary();
        calculateBonus();
    }

    private void calculateSalary() {
        netSalary = basicSalary - pf;
    }

    private void calculateBonus() {
        if (pf < 1000) {
            bonus = 0.1f * basicSalary;
        } else if (pf >= 1000 && pf < 1500) {
            bonus = 0.115f * basicSalary;
        } else if (pf >= 1500 && pf < 1800) {
            bonus = 0.12f * basicSalary;
        } else {
            bonus = 0.15f * basicSalary;
        }
    }
}


class TemporaryEmployee extends Employee {
    private int dailyWages;
    private int noOfDays;
    public TemporaryEmployee(int employeeId, String name, int dailyWages, int noOfDays) {
        super(employeeId, name, 0);
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
        calculateSalary();
        calculateBonus();
    }

    private void calculateSalary() {
        netSalary = dailyWages * noOfDays;
    }

    private void calculateBonus() {
        if (dailyWages < 1000) {
            bonus = 0.15f * netSalary;
        } else if (dailyWages >= 1000 && dailyWages < 1500) {
            bonus = 0.12f * netSalary;
        } else if (dailyWages >= 1500 && dailyWages < 1750) {
            bonus = 0.11f * netSalary;
        } else {
            bonus = 0.08f * netSalary;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "Esther", 25000, 1500);
        System.out.println("Permanent Employee Details:");
        permanentEmployee.displayDetails();

        System.out.println("\n--------------------------------\n");

        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(102, "Ganesh", 1500, 20);
        System.out.println("Temporary Employee Details:");
        temporaryEmployee.displayDetails();
    }
}

