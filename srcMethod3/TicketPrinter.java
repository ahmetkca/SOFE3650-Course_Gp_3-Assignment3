public class TicketPrinter {
    public list<String> products = new LinkedList<String>(); 
    public TicketPrinter() {

    }

    public void displayText(String text) {//subsrciber method,  waits for nottification of product input and reacts to it 
        System.out.println("Printing the Product");
        System.out.println(text);
    }

    public void ticketBuilder(String product){
        products.add(product);
    }

    public void displayTicket(){
        System.out.println(products.toString());
    }
}
