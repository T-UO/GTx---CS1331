public class GroomEverything {

	public static void main (String[] Args) {

		Groomable[] groomer = {
		// since canine is abstract, that means any  object of its concrete subclasses can be inserted
			new Wolf(17.01, 3),
			new Poodle("richie", 9, "Lux Brand", "Rich Brand"),
			new Wolf(16,5),
			new Poodle("pixy", 4, " Top Shelf", "Only the Best"),
			new Car("Yuhina", "Spark", 2037)
		};

		for (Groomable g : groomer) {
			g.groom();
		}

	}
}