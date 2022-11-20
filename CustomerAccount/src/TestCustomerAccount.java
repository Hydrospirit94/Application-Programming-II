import java.util.Scanner;
public class TestCustomerAccount {

    public static void main(String[] args){

        CustomerAccount custAcct1 = new CustomerAccount();

        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Enter payment for custAcct2: ");
        double payment = keyboardinput.nextDouble();

        System.out.println("Enter purchase for custAcct2: ");
        double purchase = keyboardinput.nextDouble();
        CustomerAccount custAcct2 = new CustomerAccount(payment, purchase);

        System.out.println("Getter value for custAcct1 payment: " + custAcct1.getPayment());
        System.out.println("Getter value for custAcct1 purchase: " + custAcct1.getPurchase());
        System.out.println("Getter value for custAcct2 payment: " + custAcct2.getPayment());
        System.out.println("Getter value for custAcct2 purchase: " + custAcct2.getPurchase());

        System.out.println("Enter payment for custAcct1: ");
        double paymentSetAcct1 = keyboardinput.nextDouble();
        custAcct1.setPayment(paymentSetAcct1);

        System.out.println("Enter purchase for custAcct1: ");
        double purchaseSetAcct1 = keyboardinput.nextDouble();
        custAcct1.setPurchase(purchaseSetAcct1);

        System.out.println("Setter value for custAcct1 payment: " + custAcct1.getPayment());
        System.out.println("Setter value for custAcct1 purchase: " + custAcct1.getPurchase());

        custAcct1.recordPayment(50.0);
        System.out.println("Updated Payment Getter Value for custAcct1: " + custAcct1.getPayment());

        custAcct1.recordPurchases(20.0);
        System.out.println("Updated Purchases Getter Value for custAcct1: " + custAcct1.getPurchase());
        
        custAcct1.printBalance();


    }
}
