package src;
import java.util.ArrayList;
import java.util.List;


public class TicketPrinter extends Observer{
    List<Observer> obs = new ArrayList<Observer>();
    
    public TicketPrinter() {  
    }

    public void notiy(){

    }

    @Override
    public void onNotify(double diss, String text){
        this.discount= diss;
        System.out.println("discount of "+ this.discount +"% was applied");
        System.out.println("Printing the Product");
        System.out.println(text);
    }


    public void displayText(String text) { 
        System.out.println("Printing the Product");
        System.out.println(text);
    }

    
}
