public class StringTwist{
	public static void main(String[] args){
		String funnyStr = "Computer!Science,!long!walks!on!the!beach";
		funnyStr.replace("!", " ");
		funnyStr.replace("the beach", " ");
		funnyStr.replace(", long", "");
		funnyStr.replace("wal", "roc");
		funnyStr.toUpperCase();
		System.out.println(funnyStr);
	}
}