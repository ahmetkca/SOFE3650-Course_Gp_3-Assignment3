import java.util.ArrayList;

public class ProductDB {



    private final ArrayList<Product> db = new ArrayList<Product>();

    public ProductDB() {

    }

    public Product getProductInfo(int upcCode) {
        Product foundProduct = null;
        for (Product product: db) {
            if (upcCode == product.getUpcCode()) {
                foundProduct = product;
                break;
            }
        }
        return foundProduct;
    }
}
