public class Fly2{

	
	private double mass;
	private double speed;

	public Fly2(double mass, double speed) {

		this.mass = mass;
		this. speed = speed;

	}

	public Fly2(double mass) {

		this.mass = mass;
		this.speed = 10.0;
	}

	public Fly2() {

		this.mass = 5.0; // 5
		this.speed = 10.0; // 10
	}

	public double getMass() {

		return mass;
	}

	public double getSpeed() {

		return speed;
	}

	// Setter methods have a return type of void
	// Setter methods job is to change a variable, not return its value
	public void setMass(double mass) {

		this.mass = mass;
	}

	public void setSpeed(double speed) {

		this.speed = speed;
	}

	public String toString() {

		if (mass == 0) {return String.format(" I'm dead, but I used to be a fly with a speed of %.2f." + speed);}

		else {return String.format("I'm a speedy fly with %.2f speed and %.2f mass.", speed, mass);}

	}

	public int grow(int addedMass) {

		double residual;
		double surplus = 0, modified_surplus;
		double original_mass = getMass();
		double modified_speed, modified_mass;
		double max_mass = 20.0;
		
		// (1,1,10)
		System.out.println("mass: " + this.mass);
		if (mass < max_mass) {

		residual = max_mass - mass;
			if (residual > 0) { // mass < 20

				for(int i = 0; mass < 20; i++) {
					speed++;
					

				}

			}
		
			mass += addedMass;
		}

		if (mass >= max_mass) {

		residual = max_mass - mass;
			if (residual <= 0) { // mass < 20
				mass += addedMass;
				speed += residual*0.5;
			}

		}
		return (int)speed;
	}

	public boolean isDead() {

		if (mass == 0) {return true;}
		else{return false;}
	}

	

	public static void main(String[] Args) {

		Fly2 ship1 = new Fly2(1,1);
		System.out.println(ship1.getMass());
		System.out.println(ship1.getSpeed());
		// ship1.grow(50);
		// System.out.println(ship1.getSpeed());
		// System.out.print(ship1.toString());
		// System.out.print(ship1.isDead());
		ship1.grow(10);
		System.out.println(ship1.getMass());
		System.out.println(ship1.getSpeed());
		// System.out.println(Fly.isDead());
		// Fly.getSpeed();

	}
 }