public class Fly{

	
	private double mass;
	private double speed;

	private static final double Default_Mass = 5.0;
	private static final double Default_Speed = 10.0;

	public Fly() {

		this(Default_Mass, Default_Speed);
	}

	public Fly(double mass) {

		this(mass, Default_Speed);
	}

	public Fly(double mass, double speed) {

		this.mass = mass;
		this.speed = speed;

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

		if (mass == 0) {return String.format("I'm dead, but I used to be a fly with a speed of %.2f.", speed);}

		else {return String.format("I'm a speedy fly with %.2f speed and %.2f mass.", speed, mass);}

	}

	public int grow(int addedMass) {

		double residual;
		double surplus = 0, modified_surplus;
		final double original_mass = this.mass; // keep original mass a constant
		double modified_speed, modified_mass;
		double max_mass = 20.0;
		modified_mass = mass + addedMass;
		residual = max_mass - mass;
		
		if(mass >= 20) {

			speed -= 0.5 * addedMass;
		}

		else if (mass + addedMass < 20) {

			speed += addedMass;
		}

		else {

			int before20 = 20 - (int)mass;
			int after20 = (int)mass + addedMass -20;
			speed+= before20 - 0.5 * after20;
		}

		mass += addedMass;

		isDead();


		return (int)speed;
	}

	public void grow() {

		grow(1);
	}

	public boolean isDead() {

		if (mass == 0) {return true;}
		else{return false;}
	}


	// public static void main(String[] Args) {

	// 	// Fly ship1 = new Fly(1,1);
	// 	// System.out.println(ship1.getMass());
	// 	// System.out.println(ship1.getSpeed());
	// 	// // ship1.grow(50);
	// 	// // System.out.println(ship1.getSpeed());
	// 	// // System.out.print(ship1.toString());
	// 	// // System.out.print(ship1.isDead());
	// 	// ship1.grow(10);
	// 	// System.out.println(ship1.getMass());
	// 	// System.out.println(ship1.getSpeed());
	// 	// // System.out.println(Fly.isDead());
	// 	// // Fly.getSpeed();

	// }
 }