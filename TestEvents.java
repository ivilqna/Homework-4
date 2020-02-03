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

			System.out.println("\nВсички си казаха здравейте!");

		} else {

			System.out.println("\nНикой не каза здравей!");

		}

		helloo = false;

		if (helloo) {

			System.out.println("\nВсички си казаха здравейте!");

		} else {

			System.out.println("\nНикой не каза здравей!");

		}

	}

}
