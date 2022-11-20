import java.util.Scanner;
public class TestProduct {

    public static void main(String[] args){
        Product prod1 = new Product();

        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Enter ProductID for prod2: ");
        int productID2 = keyboardinput.nextInt();
        keyboardinput.nextLine();

        System.out.println("Enter ProductName for prod2: ");
        String productName2 = keyboardinput.nextLine();

        System.out.println("Enter ProductManufacturer for prod2: ");
        String productManufacturer2 = keyboardinput.nextLine();

        System.out.println("Enter ProductPrice for prod2: ");
        double productPrice2 = keyboardinput.nextDouble();

        System.out.println("Enter ProductCategory for prod2: ");
        int productCategory2 = keyboardinput.nextInt();

        System.out.println("Getter value for prod1 ProductID: " + prod1.getProductID());
        System.out.println("Getter value for prod1 ProductName: " + prod1.getProductName());
        System.out.println("Getter value for prod1 ProductManufacturer: " + prod1.getProductManufacturer());
        System.out.println("Getter value for prod1 ProductPrice: " + prod1.getProductPrice());
        System.out.println("Getter value for prod1 ProductCategory: " + prod1.getProductCategory());

        Product prod2 = new Product(productID2, productName2, productManufacturer2, productPrice2, productCategory2);

        System.out.println("Getter value for prod2 ProductID: " + prod2.getProductID());
        System.out.println("Getter value for prod2 ProductName: " + prod2.getProductName());
        System.out.println("Getter value for prod2 ProductManufacturer: " + prod2.getProductManufacturer());
        System.out.println("Getter value for prod2 ProductPrice: " + prod2.getProductPrice());
        System.out.println("Getter value for prod2 ProductCategory: " + prod2.getProductCategory());

        System.out.println("Enter ProductID for prod1: ");
        int productID1Setter = keyboardinput.nextInt();
        keyboardinput.nextLine();

        System.out.println("Enter ProductName for prod1: ");
        String productName1Setter = keyboardinput.nextLine();

        System.out.println("Enter ProductManufacturer for prod1: ");
        String productManufacturer1Setter = keyboardinput.nextLine();

        System.out.println("Enter ProductPrice for prod1: ");
        double productPrice1Setter = keyboardinput.nextDouble();

        System.out.println("Enter ProductCategory for prod1: ");
        int productCategory1Setter = keyboardinput.nextInt();

        prod1.setProductID(productID1Setter);
        prod1.setProductName(productName1Setter);
        prod1.setProductManufacturer(productManufacturer1Setter);
        prod1.setProductPrice(productPrice1Setter);
        prod1.setProductCategory(productCategory1Setter);

        System.out.println("Value after setter for prod1 ProductID: " + prod1.getProductID());
        System.out.println("Value after setter for prod1 ProductName: " + prod1.getProductName());
        System.out.println("Value after setter for prod1 ProductManufacturer: " + prod1.getProductManufacturer());
        System.out.println("Value after setter for prod1 ProductPrice: " + prod1.getProductPrice());
        System.out.println("Value after setter for prod1 ProductCategory: " + prod1.getProductCategory());

        double listPrice = prod1.calculateListPrice(0.3);

        System.out.println("Calculated List Price: " + listPrice);
    }
}
