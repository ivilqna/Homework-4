package fmi.informatics.events;

public class User implements Observer {

	private String name;

	private Observable observable;

	public User(String name, Observable observable) {

		this.name = name;

		this.observable = observable;

	}

	public void unsubscribe() {

		observable.removeObserver(this);

	}

	public void hello() {

		System.out.println( name + " said hello!");

	}

	@Override

	public void update() {

		hello();

	}

}
