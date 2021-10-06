package src;
public class MyScanner {

    private final CashRegister cashRegister; // Model

    public MyScanner(CashRegister cashRegister) {
        this.cashRegister = cashRegister;

    }

    public void scannedUPCCode(int id) {
        
        cashRegister.setCurrentProductUPC(cashRegister.processScanner());

    }
}
