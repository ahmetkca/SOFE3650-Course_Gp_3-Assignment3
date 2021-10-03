public class CashRegister {

    private final ProductDB productDb;
    private long currentUpcCode;
    private View view;

    public CashRegister(View view) {
        productDb = new ProductDB();
        currentUpcCode = -1;
        this.view = view;
    }

    public void setView(View view){
        this.view = view;
    }

    public void setCurrentProductUPC(long upcCode) {
        currentUpcCode = upcCode;
    }

    public void processScanner(){

    }

    public void getCurrentProductInfo() {
        Product pro = null;
        if (currentUpcCode != -1) {
            pro = productDb.getProductInfo(currentUpcCode);
        }
        if (pro != null) {
            view.displayProduct(pro);
        } else {
            System.out.println("Product with given UPC Code " + currentUpcCode + " could not found in the ProductDB!");
        }
    }
}
