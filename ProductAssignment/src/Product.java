public class Product {

    private int productID;

    private String productName;

    private String productManufacturer;

    private double productPrice;

    private int productCategory;

    public Product(){

    }

    public Product(int productID, String productName, String productManufacturer, double productPrice, int productCategory) {
        this.productID = productID;
        this.productName = productName;
        this.productManufacturer = productManufacturer;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    public int getProductID(){
        return this.productID;
    }

    public void setProductID(int productID){
        this.productID = productID;
    }

    public String getProductName(){
        return this.productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductManufacturer(){
        return this.productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer){
        this.productManufacturer = productManufacturer;
    }

    public double getProductPrice(){
        return this.productPrice;
    }

    public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
    }

    public int getProductCategory(){
        return this.productCategory;
    }

    public void setProductCategory(int productCategory){
        this.productCategory = productCategory;
    }

    public double calculateListPrice(double discount){
         return productPrice * (1 - discount);
    }
}
