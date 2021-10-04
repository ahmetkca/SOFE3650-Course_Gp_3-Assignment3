package src;
import java.util.*;

public class TicketPrinter {
    public LinkedList<String> list=new LinkedList<String>();
    public TicketPrinter() {
         
    }

    public void displayText(String text) {//subsrciber method,  waits for nottification of product input and reacts to it 
        System.out.println("Printing the Product");
        System.out.println(text);
    }

    public void ticketBuilder(String text){
        list.add(text);
    }

    public void displayTicket(){
        System.out.println(list.toString());
    }
}
