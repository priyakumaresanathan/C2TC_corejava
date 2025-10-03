package day5.association.Has;


	public class Executor {

		public static void main(String[] args) {
			Address address = new Address("504 Roman Enclave, Cena Colony", "Nashik", "Japan", "422003");
			Person person = new Person ("Virat Kohli", address);
			person.displayInfo();

		}

	}