import java.util.Scanner;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private double stockOption;

    public SalariedEmployee() {

    }

    public SalariedEmployee(int empNumber, String empName, String dateHired, double annualSalary, double stockOption) {
        super(empNumber, empName, dateHired);
        this.annualSalary = annualSalary;
        this.stockOption = stockOption;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getStockOption() {
        return stockOption;
    }

    public void setStockOption(double stockOption) {
        this.stockOption = stockOption;
    }

    public void calculatePension(){
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println(" Enter Employee Pension Rate: ");
        double pensionRate = keyboardinput.nextDouble();
        System.out.println("Pension Payment: " + ((annualSalary - stockOption)*(pensionRate)));

    }
}
