public class Product {

    private String name;
    private int upcCode;
    private double price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", upcCode=" + upcCode +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(int upcCode) {
        this.upcCode = upcCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, int upcCode, double price) {
        this.name = name;
        this.upcCode = upcCode;
        this.price = price;
    }
}
