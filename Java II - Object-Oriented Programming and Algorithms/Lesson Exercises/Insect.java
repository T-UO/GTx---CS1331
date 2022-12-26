import java.lang.Math;

public class Insect {

	private double weight; // by adding the keyword "private," we control which classes can access and manipulate the variables
	private int x; // private keyword creates encapsulation by giving access to an instance varibale to just the methods within its class
	private int y;


	
	// final modifier means it's a constant / cannot be changed
	// public constants don't violate encapsulation
	// a constant can't be changed outside its class
	// a constatnt can't be changed within its class after it has been assigned its initial value
	public static final int DEFAULT_X = 0;
	public static final int DEFAULT_Y = 0;
	public static final double DIST_WEIGHT_LOSS_FACTOR = .0001; // static modifier turns a member into a shared entity across all objects of the same class
	private static int population = 0;
	private static final String[] FACTS = {

		"The two main groups of insects are winged and wingless",
		"There are more than 1 million insect species",
		"Insects are cold-blooded",
		"Spiders are not considered insects"
	};

	// constructor
	// to allow custom initial values, we will need to write our own constructor method
	// constructors are the only kind of methods that are declared without a return type and they have to be
	// the name of a constructor must be the same as the name of the class

	// constructor chaining
	// in constructor chaining, a more specific constructor is alwasy called by a less specific constructor
	// this() calls another constructor within the same class; new creates a whole new object, so don't use new
	// this() delegates the initialization rather than instantiating a new object
	// when you use this() within a constructor, it must be the first statement of that constructor
	// this() will invoke second constructor and we pass in everything that constructor needs
	// this() keyword can also be used as a reference within a constructor or non-static method

	public Insect (double initWeight) {

		this(initWeight, DEFAULT_X, DEFAULT_Y);
	}


	
	public Insect(double weight, int x, int y) {

		this.weight = weight;
		this.x = x;
		this.y = y;
	}


	// Methods

	// public methods that simply return the value of an instance value
	// such methods are called accessors because they allow the clients to access a variable's value
	// accessor methods are called getter methods
	// getter methods do not have any parameters

	public double getWeight() {

		return weight;
	}

	public int getX() {

		return x;
	}

	public void setX (int x) {

		if (isLegalX(x)) {

			this.x = x;
		}
	}

	public int getY() {

		return y;
	}

	public static int getPopulation() {

		return population;
	}

	// Mutator (or Setter) Methods
	// Setter Methods have a return type of void
	// Their job is to change a variable not return its value

	// shadowing instance variable with this()
	public void setY(int y) {

		if (isLegalY(y)) {
			this.y = y;
		}
	}

	public static boolean isLegalX (int newX) {

		return (newX >= 0 ? true: false);
	}

	public static boolean isLegalY (int newY) {

		return (newY >= 0 ? true: false);
	}


	public void eat(double amount) {

		System.out.println("Nibble Nibble");
		weight = weight + amount;
	}

	public void move(int newX, int newY) {

		double distance = calculateDistance(x, y, newX, newY);
		if (distance > 0) {

			x = newX;
			y = newY;
			weight = weight * DIST_WEIGHT_LOSS_FACTOR * distance;
			System.out.printf("Moved %.2f units\n" , distance);


		}

		else {System.out.println("Staying put");
		}
	}


	// helper method
	// helper methods are typically static
	// static method belongs to a class and it's not something you invoke on a specific instance of that class
	private static double calculateDistance(double x1, double y1, double x2, double y2) {

		return Math.sqrt((y2 -y1) * (y2-y1) + (x2-x1) * (x2-x1));
	}


	public static String produceRandomFact() {

		int index = (int)(Math.random() * ((FACTS.length -1) + 1));
		return FACTS[index];
	}

	// used to generate a string representation of the object
	// we must override the default toString in order for it to print something more user-friendly
	public String toString() {

		return "weight: " + weight + ", x: " + x + ", y: " + y;
	}

	// test method
	public static void main(String[] Args) {

		System.out.println("Insect Population: " + population);
		// Insect buzz1 = new Insect(); // new operator creates an instance of some class and then calls a special method in a class called a constructor
		// Insect buzz2 = new Insect(); // it's a constructors job to initialize the new instance
		Insect bug1 = new Insect(10, 100, 90);
		System.out.println("Insect Population: " + population);
		Insect bug2 = new Insect(4, -300, 400);
		System.out.println("Insect Population: " + population);

		bug1.move(1,10);
		bug2.move(-300, 400);

		System.out.println(produceRandomFact());

	}
}