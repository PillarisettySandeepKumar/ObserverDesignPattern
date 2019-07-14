public class ObserverMain  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Channel channel=new Channel();
		
		Subscriber subscriber1=new Subscriber("Sandeep");
		Subscriber subscriber2=new Subscriber("Kumar");
		Subscriber subscriber3=new Subscriber("Deepu");

		subscriber1.subscribeChannel(channel);
		subscriber2.subscribeChannel(channel);
		subscriber3.subscribeChannel(channel);

		channel.subscribe(subscriber1);
		channel.subscribe(subscriber2);
		channel.subscribe(subscriber3);
		
		
		channel.notifySubscriber("Java");
		
			
	}

}
