import java.sql.SQLOutput;
import java.util.*;
class Account {
    private int id;
    private String accountType;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {

    }
    public Account(int id,String accountType,double balance) {
        this.id=id;
        this.accountType=accountType;
        this.balance=balance;
    }
    public boolean WithDraw(double amount) {
        if(balance-amount<0) {
            return false;
        }else {
            balance = balance - amount;
            return true;
        }
    }
    public void getDetails(){
        System.out.println("Account Id: "+id);
        System.out.println("Account Type: "+accountType);
        System.out.println("Balance: "+balance);
    }

}
public class Main {

    public static void main(String[] args) {
          Account obj=new Account(101,"Savings",5000);
          System.out.println("Account Details: ");
          obj.getDetails();
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter amount to withdraw: ");
          double m=Double.parseDouble(sc.nextLine());
          if(obj.WithDraw(m)){
              System.out.println("New Balance: "+obj.getBalance());
          }
          else{
              System.out.println("Insufficient balance!");
          }

    }
}

