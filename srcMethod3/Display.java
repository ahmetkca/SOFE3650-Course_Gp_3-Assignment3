public class Display {

    public Display() {

    }

    public void displayText(String text) {//subscriber method, waits for nottification of product input and reacts to it 
        System.out.println("Displaying the Product: ");
        System.out.println(text);
    }
}
