public class CashRegister {

    private final ProductDB productDb;
    private long currentUpcCode;
    private final Display display;
    private final TicketPrinter ticketPrinter;

    public CashRegister(Display display, TicketPrinter ticketPrinter) {
        productDb = new ProductDB();
        currentUpcCode = -1;
        this.display = display;
        this.ticketPrinter = ticketPrinter;
    }

    public void setCurrentProductUPC(long upcCode) {
        currentUpcCode = upcCode;
    }

    public void getCurrentProductInfo() {
        Product pro = null;
        if (currentUpcCode != -1) {
            pro = productDb.getProductInfo(currentUpcCode);
        }
        if (pro != null) {
            display.displayText(pro.toString());
            ticketPrinter.displayText(pro.toString());
        } else {
            System.out.println("Product with given UPC Code " + currentUpcCode + " could not found in the ProductDB!");
        }
    }
}
