public class Car implements Groomable { // implements shows that objects of the car class are also objects of the groomable type

	private String make;
	private String model;
	private int year;
	private int charge; // it's electric boogie woogie woggie
	private boolean powered;
	private int speed;

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void start() {
		if (charge > 0) {
			System.out.println("ding");
			powered = true;
		}
	}

	public void groom() {
		if (speed == 0) {
			System.out.println("soap, rinse, wax, and little tree air freshner");
		}
	}
}