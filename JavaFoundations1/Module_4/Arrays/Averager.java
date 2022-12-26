public class Averager {
	public static void main(String[] Args){
		 double [] weekHighs = {80, 70, 75, 69, 72, 74,90};	

		 // double averageHighs = (weekHighs[0] + weekHighs[1] + weekHighs[2] + weekHighs[3] + weekHighs[4] + weekHighs[5] + weekHighs[6])/ weekHighs.length;

		 // System.out.println("Average is: " + averageHighs);

		 // Example 1
		 // double highsSum = 0;

		 // for (int index = 0; index <= weekHighs.length; index ++) {
		 // 	highsSum = highsSum + weekHighs[index];
		 // }

		 // double averageHighs = highsSum / weekHighs.length;

		 // System.out.println("Average is =: " + averageHighs);


		 // // Example 2
		 // for (double dayHigh : weekHighs) {
		 // 	highsSum = highsSum + dayHigh;
		 // }

		 // double averageHighs = highsSum / weekHighs.length;
		 // System.out.println(averageHighs);

		 // Example 3

		 double sum = 0;

		 for (String num : Args) {
		 	sum += Double.parseDouble(num); // convert String to double
		 }

		 double average = (Args.length > 0) ? (sum / Args.length) : 0;
		 System.out.println("Average is: " + average);
	}
}