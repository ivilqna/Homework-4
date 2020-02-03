package fmi.informatics.events;

import java.util.ArrayList;

import java.util.List;

public class Test implements Observable {

	private List<Observer> people = new ArrayList<>();

	private boolean hello;

	@Override

	public void addObserver(Observer o) {

		people.add(o);

	}

	@Override

	public void removeObserver(Observer o) {

		people.remove(o);

	}

	@Override

	public void notifyObserver() {

		for (Observer person : people) {

			person.update();

		}

	}

	public boolean isHello() {

		return hello;

	}

	public void setHello(boolean hello) {

		this.hello = hello;

		if (hello)
			notifyObserver();

	}

}
