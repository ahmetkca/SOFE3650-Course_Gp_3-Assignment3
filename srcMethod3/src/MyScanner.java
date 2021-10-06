package src;
public class MyScanner {

    private final CashRegister cashRegister; // Model

    public MyScanner(CashRegister cashRegister) {
        this.cashRegister = cashRegister;

    }

    public void scannedUPCCode(int id) {
        if(id==1){//applie observer
        double discount=0.5;
        cashRegister.setCurrentProductUPC(cashRegister.processScanner());
        }
        else{
        cashRegister.setCurrentProductUPC(cashRegister.processScanner());
        }

    }
}
