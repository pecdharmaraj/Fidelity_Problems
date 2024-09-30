import java.sql.Array;
import java.util.*;
class Insurance{
    String insuranceNo;
    String insuranceName;
    double amountCovered;
    public Insurance(String insuranceNo,String insuranceName,double amountCovered){
        this.insuranceNo=insuranceNo;
        this.insuranceName=insuranceName;
        this.amountCovered=amountCovered;
    }
    public double calculatorPremium() {
        return 0.0;
    }
}
class LifeInsurance extends Insurance{
    private int policyTerm;
    private float benefitPercent;
    public LifeInsurance(String insuranceNo,String insuranceName,double amountCovered,int policyTeam,float benefitPercent){
        super(insuranceNo,insuranceName,amountCovered);
        this.policyTerm=policyTeam;
        this.benefitPercent=benefitPercent;
    }
    public double calculatorPremium(){
        double premium=(amountCovered-((amountCovered*benefitPercent)/100))/policyTerm;
        return premium;
    }
}
class MotorInsurance extends Insurance{
    private double idv;
    private float depPercent;
    public MotorInsurance(String insuranceNo,String insuranceName,double amountCovered,float depPercent){
        super(insuranceNo,insuranceName,amountCovered);
        this.idv=amountCovered;
        this.depPercent=depPercent;
    }

    @Override
    public double calculatorPremium() {
        double premium=idv-((idv*depPercent)/100);
        premium=premium*0.03;
        return premium;
    }
}
public class Dsa{
    public static void addPolicy(Insurance insurance){
        double premium=insurance.calculatorPremium();
        System.out.println("calculated premium: "+premium);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Insurance Number: ");
        String insuranceNo=sc.nextLine();
        System.out.println("Insurance Name: ");
        String insuranceName=sc.nextLine();
        System.out.println("Amount covered: ");
        double amountCovered=sc.nextDouble();
        System.out.println("Select\n1. Life Insurance\n2. Motor Insurance");
        int option=sc.nextInt();
        if(option==1){
            System.out.println("Policy Term: ");
            int policyTerm=sc.nextInt();
            System.out.println("Benefit Percent: ");
            float benefitPercent=sc.nextFloat();
            LifeInsurance lifeInsurance=new LifeInsurance(insuranceNo,insuranceName,amountCovered,policyTerm,benefitPercent);
            addPolicy(lifeInsurance);
        }else if(option==2){
            System.out.println("Depreciation Percent: ");
            float depPercent=sc.nextFloat();
            MotorInsurance motorInsurance=new MotorInsurance(insuranceNo,insuranceName,amountCovered,depPercent);
            addPolicy(motorInsurance);
        }else{
            System.out.println("Invalid option.");
        }
    }
}