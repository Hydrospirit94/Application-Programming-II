
public class TestPayable {

    public static void main(String[] args) {
        Payable payObj1 = new HourlyEmployee(131, 67.0, "2/3/2019");
        Payable payObj2 = new SalariedEmployee(37, 70000, "5/4/2018");
        Payable payObj3 = new Invoice(5, 7, 7.99, 9);

        HourlyEmployee payObj4 = new HourlyEmployee(54, 42.0, "9/22/2014");
        SalariedEmployee payObj5 = new SalariedEmployee(90, 85000, "8/9/2012");
        Invoice payObj6 = new Invoice(87, 44, 10.99, 27);

        payObj1.getPaymentAmount();
        payObj2.getPaymentAmount();
        payObj3.getPaymentAmount();
        payObj4.getPaymentAmount();
        payObj5.getPaymentAmount();
        payObj6.getPaymentAmount();
    }
}


