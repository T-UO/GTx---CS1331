public class StringOperations{
	public static void main(String[] Args){

		// Section 2: String Methods
		String s1, s2;
		String name = new String("Tagbo");
		System.out.println(name);
		s1 = name.replace("T","A");
		System.out.println(s1.replace("o","Z"));
		String url = "www.espn.com";
		System.out.println(url);
		System.out.println(url.substring(4,8) + "1331");

	}
}