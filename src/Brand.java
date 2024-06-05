

public class Brand implements Comparable<Brand>{
    int brandID;
    String brandName;

    public Brand(int brandID,String brandName) {
        this.brandID = brandID;
        this.brandName = brandName;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public int compareTo(Brand o) {
        return this.getBrandName().compareTo(o.getBrandName());
    }
}
