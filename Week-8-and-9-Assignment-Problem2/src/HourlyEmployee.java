import java.util.Scanner;
public class HourlyEmployee implements Payable{

    private int empNumber;
    private double hourlyRate;
    private String contractDate;

    public int getEmpNumber() {
        return empNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public String getContractDate() {
        return contractDate;
    }

    public HourlyEmployee(int empNumber, double hourlyRate, String contractDate) {
        this.empNumber = empNumber;
        this.hourlyRate = hourlyRate;
        this.contractDate = contractDate;
    }

    public void calculateWages(){
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Enter Employee Number Of Hours Worked: ");
        double numberOfHours = keyboardinput.nextDouble();
        System.out.println("Total Wages: " + (numberOfHours * hourlyRate));
    }

    @Override
    public void getPaymentAmount() {
        this.calculateWages();
    }
}
