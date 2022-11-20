public class SalariedEmployee implements Payable{

    private int empNumber;
    private double annualSalary;
    private String hireDate;

    public int getEmpNumber() {
        return empNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public SalariedEmployee(int empNumber, double annualSalary, String hireDate) {
        this.empNumber = empNumber;
        this.annualSalary = annualSalary;
        this.hireDate = hireDate;
    }

    @Override
    public void getPaymentAmount() {
        System.out.println("Employee Annual Salary: " + annualSalary);
    }
}
