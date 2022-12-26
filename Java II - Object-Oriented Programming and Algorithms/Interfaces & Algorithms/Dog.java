public class Dog extends Canine{

	protected String name;

	public Dog(String name, double size) {

		super(size); // super keyword in the form of a method calls the superclass' constructor
		this.name = name;
	}

	public void fetch() {

		System.out.println("Run");
		System.out.println("Clinch");
		System.out.println("Return");

	}

	public String toString() {

		return("Name: " + name + "; Size: " + size);
	}

	public void groom() {}

	// overidden equals method
	public boolean equals(Object o) {

	

		if (! (o instanceof Dog)) {

			return false;
		}

		Dog doggy = (Dog) o;
		return ((doggy.size == size) && (doggy.name.equals(name)));

	}

	public static void main(String[] Args) {

		Dog dog1 = new Dog("Spot", 9.6);
		Dog dog2 = new Dog("Spot", 9.6);
		System.out.println(dog1.equals(dog2));
	}
}