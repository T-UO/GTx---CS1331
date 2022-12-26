
public class Pond{


	public static void main(String[] Args) {

		Frog peepo = new Frog("Peepo");
		Frog pepe = new Frog("Pepe", 10, 15);
		Frog peepaw = new Frog("Peepaw", 4.6, 5);
		Frog beppy = new Frog("Beppy");

		Fly fly1 = new Fly(1,3);
		Fly fly2 = new Fly(6);
		Fly fly3 = new Fly(5);

		peepo.setSpecies("1331 Frogs"); // step 1
		System.out.println((peepo.toString())); // step 2
		peepo.eat(fly2); // step 3
		System.out.println((fly2.toString())); // step 4
		peepo.grow(8); // step 5
		peepo.eat(fly2); // step 6
		// System.out.println(isCaught(fly2)); // marker to test isCaught method
		// System.out.println(peepo.getAge()); // marker to test grow method
		System.out.println((fly2.toString())); // step 7
		System.out.println((peepo.toString())); // step 8
		System.out.println((beppy.toString())); // step 9
		peepaw.grow(4); // step 10
		System.out.println((peepaw.toString())); // step 11
		System.out.println((pepe.toString())); // step 12

	}

}