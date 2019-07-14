import java.util.ArrayList;
import java.util.List;

public class Channel {

	List<Subscriber> subscribers = new ArrayList<Subscriber>();
	String title;

	public void subscribe(Subscriber subscriber) {

		subscribers.add(subscriber);
	}

	public void unSubscribe(Subscriber subscriber) {

		subscribers.remove(subscriber);

	}

	public void notifySubscriber(String title) {
		
	for (Subscriber subscriber : subscribers) {
		subscriber.update(title);

	}
		
	}
	
	public void upload(String title) {

		notifySubscriber(title);
	}
}
