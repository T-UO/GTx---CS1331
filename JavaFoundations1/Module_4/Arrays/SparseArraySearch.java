public class SparseArraySearch{
	public static void main(String[] Args){
		
		String [] concepts = "abstraction";
		concepts [0] = "abstraction";
		concepts [2] = "polymorphism";
		concepts [3] = "inheritance";
		concepts[4] = "encapsulation";
		string result = "not found";

		for(String concept : concepts) {
			if ((concept != null) && (concept.equals("polymorphism"))) {
				result = "found";
				break;
			}
		}

		System.out.println(result);
	}
}