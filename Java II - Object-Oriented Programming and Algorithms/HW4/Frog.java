public class Frog{

	private String name;
	private int age;
	private static double tongueSpeed = 5.0;
	private boolean isFroglet;
	private static String species = "Rare Pepe";

	public Frog(String name, int age, double tongueSpeed) {

		this.name = name;
		this.age = age;
		this.tongueSpeed = tongueSpeed;
	}

	public Frog(String name, double ageInYears, double tongueSpeed) {

		this(name, (int)tongueSpeed);
		// this.name = name;
		this.age = (int) (ageInYears * 12);
		// this.tongueSpeed = tongueSpeed;
	}

	public Frog(String name) {
		this(name, (int)tongueSpeed);
		// this.name = name;
		this.age = 5;
		// this.tongueSpeed = 5;
		
	}



	public Frog(String name, int age) {

	}

	public Frog() {

	}

	

	// public int grow(int months) {

	// 		// Frog frog1 = new Frog(this.name);
	// 		if(tongueSpeed >= 5) {
	// 			while (age <= 12){

	// 				age += months;
	// 				tongueSpeed += months;

	// 			}
		
	// 				if (age >= 30) {tongueSpeed-=(months-30);}			
			
	// 		}
	// 		else{System.out.println("You must not decrease tongueSpeed to less than 5.");}
	// 		if(age < 1 && age < 7) {isFroglet = true;}
	// 	return age;	
	// }

	public int grow(int months) {

			for(int i = 1; i <= months; i++) {

				age += 1;

				if (age <= 12) {
					tongueSpeed += 1;
				} else if (age <= 30) {

				} else { 
					tongueSpeed -=1;
				}
			}

		tongueSpeed = (tongueSpeed < 5) ? 5: tongueSpeed;
		isFroglet = (age > 1) && (age < 7);

		return (int)tongueSpeed;
	}


	public void grow() {

		grow(1);
	}

	// public void eat(Fly fly1){

		
	// 	if(fly1.isDead() == true) {return;}

	// 	if(isCaught(fly1) == true && fly1.getMass() >= (0.5 * Frog.age )) {Frog.grow(); fly1.setMass(0);}

	// 	if(isCaught(fly1) == true) {fly1.setMass(0); isCaught(fly1);}
	// 	else{fly1.grow(1);}


	// }

	public void eat(Fly prey){

		if(!prey.isDead()) {

			if(tongueSpeed > prey.getSpeed()) {

				if (prey.getMass() >= (age * 0.5)) {
					grow();
				}

				prey.setMass(0);
			} else {
				prey.grow(1);
			}
		}
	}

	public boolean isCaught(Fly fly1) {
		
		boolean val;
		if (tongueSpeed > fly1.getSpeed()) {val = true;}
		else{val = false;}
		return val;

	}

	public static void setSpecies(String newSpecies) {

		species = newSpecies;
	}

	public String getSpecies() {

		return species;
	}

	// public int getAge() {

	// 	return age;
	// }

	public String toString() {

		// return String.format("name: %f\n age: %f\n  tongueSpeed: %f\n", name, age, tongueSpeed);
		String s;
		if (isFroglet == true) {

			s = String.format("My name is %s and I’m a rare froglet! I’m %d months old and my tongue has a speed of %.2f.", name, age, tongueSpeed);
		}

		else { s = String.format("My name is %s and I’m a rare frog. I’m %d months old and my tongue has a speed of %.2f.", name, age, tongueSpeed);}

		return s;
	}

	// public static void main(String[] args) {
	// 	Frog frog1 = new Frog("Peepo", 55, 10);
	// 	// // System.out.println(frog1.grow(10));
	// 	// Fly flyone = new Fly();
	// 	// // flyone.getSpeed();
	// 	// // System.out.println(eat(flyone));
		
	// 	System.out.println(frog1.age);
	// 	System.out.println(frog1.grow(8));
	// 	// // frog1.toString();

	// }
}