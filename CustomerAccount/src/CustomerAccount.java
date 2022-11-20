public class CustomerAccount {
    private double payment;
    private double purchase;

    public CustomerAccount() {
        this.payment = 0;
        this.purchase = 0;
    }

    public CustomerAccount(double payment, double purchase){
        this.payment = payment;
        this.purchase = purchase;
    }

    public double getPayment() {
        return this.payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getPurchase() {
        return this.purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    public void recordPayment(double amount) {
        this.payment += amount;
    }

    public void recordPurchases(double amount) {
        this.purchase += amount;
    }

    public void printBalance() {
        System.out.println("Balance: " + (payment - purchase));
        System.out.println("    Payment: " + payment);
        System.out.println("    Purchase: " + purchase);
    }


}
