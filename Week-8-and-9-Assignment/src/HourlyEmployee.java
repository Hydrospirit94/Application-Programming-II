import java.util.Scanner;

public class HourlyEmployee extends Employee {

    private double hourlyRate;

    public HourlyEmployee() {

    }

    public HourlyEmployee(int empNumber, String empName, String dateHired, double hourlyRate) {
        super(empNumber, empName, dateHired);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void calculateWages() {

        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Enter Employee Number Of Hours Worked: ");
        double numberOfHours = keyboardinput.nextDouble();
        System.out.println("Total Wages: " + (numberOfHours * hourlyRate));
    }
}
