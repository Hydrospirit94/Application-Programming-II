public class Employee {

    private String empName;
    private int empNumber;
    private String dateHired;

    public Employee() {

    }

    public Employee(int empNumber, String empName, String dateHired) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.dateHired = dateHired;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void printLabel() {

        System.out.println(" Employee Name: " + empName);
        System.out.println(" Employee Number: " + empNumber);
        System.out.println(" Employee Date Hired: " + dateHired);
    }
}
