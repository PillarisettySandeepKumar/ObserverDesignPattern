
public class Subscriber {

	private String name;

	private Channel channel = new Channel();

	public Subscriber(String name) {
		this.name = name;
	}

	public void update(String title) {

		System.out.println(name + " " + title + " Video uploaded");
	}

	public void subscribeChannel(Channel ch) {
		this.channel = ch;

	}

}
