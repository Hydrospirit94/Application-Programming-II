public class Invoice implements Payable{

    private int invoiceNumber;
    private int itemNumber;
    private double itemUnitPrice;
    private int quantity;

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public double getItemUnitPrice() {
        return itemUnitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Invoice(int invoiceNumber, int itemNumber, double itemUnitPrice, int quantity) {
        this.invoiceNumber = invoiceNumber;
        this.itemNumber = itemNumber;
        this.itemUnitPrice = itemUnitPrice;
        this.quantity = quantity;
    }

    @Override
    public void getPaymentAmount() {
        System.out.println("Total Price: " + (quantity * itemUnitPrice));
    }
}
