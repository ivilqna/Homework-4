package fmi.informatics.events;

public class TestEvents {

	public static void main(String[] args) {

		Test hello = new Test();

		User user = new User("Nick", hello);

		User user1 = new User("John", hello);

		User user2 = new User("Emy", hello);

		hello.addObserver(user);

		hello.addObserver(user1);

		hello.addObserver(user2);

		hello.setHello(true);



		boolean helloo = true;

		if (helloo) {

			System.out.println("\n������ �� ������ ���������!");

		} else {

			System.out.println("\n����� �� ���� �������!");

		}

		helloo = false;

		if (helloo) {

			System.out.println("\n������ �� ������ ���������!");

		} else {

			System.out.println("\n����� �� ���� �������!");

		}

	}

}
