public class Scanner {

    private final CashRegister cashRegister; // Model

    public Scanner(CashRegister cashRegister) {
        this.cashRegister = cashRegister;

    }

    public void scannedUPCCode(long upcCode) {
        cashRegister.setCurrentProductUPC(upcCode);

    }
}
