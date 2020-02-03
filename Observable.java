package fmi.informatics.events;

// ��������� ��������� Observable (����������)

public interface Observable {

	public void addObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObserver();

}
