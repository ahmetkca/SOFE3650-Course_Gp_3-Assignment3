public class TicketPrinter implements Subscriber{

    public TicketPrinter() {

    }

    public void displayText(String text) {
        System.out.println("Printing the Product");
        System.out.println(text);
    }

    @Override
    public void update(String text) {
        this.displayText(text);
        
    }
}
