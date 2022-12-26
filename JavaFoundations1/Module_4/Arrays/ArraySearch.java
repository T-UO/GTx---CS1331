public class ArraySearch {
	public static void main(String[] Args) {
		String [] concepts = {"abstraction", "polymorphism", "inheritance", "encapsulation"};
		
		System.out.println(searchStringArray("polymorphism", concepts));
		System.out.println(searchStringArray("inheritance", concepts));

		String[] pasttimes = {"long walks", "sunrises", "sunsets", "skipping rocks"};
		System.out.println(searchStringArray("sunsets", pasttimes));
		System.out.println(searchStringArray("breakdancing", pasttimes));

		int[] num = {2,3,4,5,6};
		System.out.println(searchIntArray(1, num));

		// String result = searchStringArray ("polymorphism", concepts);

		// System.out.println(result);

		// result = searchStringArray("inheritance", concepts);
		// System.out.println(result);

		

	}
	// creating a method
	public static boolean searchStringArray(String target, String[] array) {
		boolean result = false;
		for (String element : array) {
			if (element.equals(target)) {
				result = true;
				break;
			}
		}
		return result;

	}

	public static boolean searchIntArray(int target, int[] array) {
		boolean result = false;
		for (int element : array) {
			if (element == target) {
				result = true;
				break;
			}
		}
		return result;
	}
}