public class SomeOtherProgram2 {
	public static void main(String[] Args) {

		String[] lullabies = {"Wheels on the bus", "Twinkle, Twinkle Little Star", "Itsy Bitsy Spider", " Swing Low Sweet Chariot", "Amazing Grace"};

		System.out.println(ArraySearch2.searchArray("Humpty Dumpty", lullabies));

		int[] weekHighs = {80, 70, 75, 69, 72, 74, 90};
		System.out.println(ArraySearch2.searchArray(90,weekHighs));
	}
}