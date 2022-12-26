

public class PrimitiveOperations{
	public static void main(String [] Args){

		// Section 1: Primitive Operations
		int a = 1;
		float b = 2;
		System.out.println(a);
		System.out.println(b);
		float ab = a*b;
		System.out.println(ab);
		float c = a;
		System.out.println(c);
		int d = (int) b;
		System.out.println(d);
		char ch1, ch2;
		ch1 = 'T';
		ch2 = Character.toUpperCase(ch1);
		System.out.println(ch2);
		System.out.println(Character.toChars(ch2+32));
	}
}