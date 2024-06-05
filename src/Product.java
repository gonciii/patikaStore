
// PRODUCT (ÜRÜN)

public abstract class Product {

     private static int idCount = 1;
     int id;
     String name;
     double unitPrice;
     double discountRate;
     int stockAmount;
     static Brand brand;
     String color;

    public Product(String name, double unitPrice, double discountRate, int stockAmount,Brand brand,String color) {
        this.id = idCount++;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        Product.brand = brand;
        this.color = color;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Product.idCount = idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public static Brand getBrand() {
        return brand;
    }

    public static void setBrand(Brand brand) {
        Product.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
