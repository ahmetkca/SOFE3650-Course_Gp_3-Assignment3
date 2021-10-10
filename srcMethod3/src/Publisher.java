import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    public List<Subscriber> subscribers = new ArrayList<Subscriber>();
    
    public abstract void subscribe(Subscriber subsrcriber);
    public abstract void unsubscribe(Subscriber subsrcriber);
    public abstract void notify(String text);
}
