import java.util.Scanner;

public class Consultant extends Employee {

    private int contractNumber;
    private double billingRate;

    public Consultant() {

    }

    public Consultant(int empNumber, String empName, String dateHired, int contractNumber, double billingRate) {
        super(empNumber, empName, dateHired);
        this.contractNumber = contractNumber;
        this.billingRate = billingRate;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getBillingRate() {
        return billingRate;
    }

    public void setBillingRate(double billingRate) {
        this.billingRate = billingRate;
    }

    public void calculateFees(){
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Enter Number Of Hours Worked: ");
        double hoursWorked = keyboardinput.nextDouble();
        System.out.println("Consultant Fees: " + (hoursWorked * billingRate));
    }
}
