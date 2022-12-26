public abstract class Canine implements Groomable {


	// protected members are not quite public or static; they are somewhere in between

	protected double size;

	public Canine(double size) {

		this.size = size;
	}

	public void bark() {

		System.out.println("Woof Woof");
	}

	// public abstract void groom();

}