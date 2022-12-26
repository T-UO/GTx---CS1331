public class Gameplay {



	public static void main(String[] args) {

		/** Players **/
		BlueAstronaut bob = new BlueAstronaut("Bob",20,6,30);
		BlueAstronaut heath = new BlueAstronaut("Heath",30,3,21);
		BlueAstronaut albert = new BlueAstronaut("Albert",44,2,0);
		BlueAstronaut angel = new BlueAstronaut("Angel",0,1,0);
		RedAstronaut liam = new RedAstronaut("Liam",19,"experienced");
		RedAstronaut suspicious_person = new RedAstronaut("Suspicious Person",100,"expert");
		
		/** Tests **/

		// Step1
		liam.sabotage(bob);
		System.out.println(bob.getSusLevel());
		System.out.println(bob.isFrozen());
		// Step2		
		liam.freeze(suspicious_person);
		System.out.println(suspicious_person.isFrozen());
		System.out.println(suspicious_person.getSusLevel());
		// Step3
		System.out.println(albert.isFrozen());
		liam.freeze(albert);
		System.out.println(liam.getSusLevel());
		System.out.println(albert.isFrozen());
		System.out.println(liam.isFrozen());
		// Step4
		albert.emergencyMeeting();
		// Step5
		System.out.println(suspicious_person.isFrozen());
		suspicious_person.emergencyMeeting();
		// Step6
		bob.emergencyMeeting();
		System.out.println(suspicious_person.isFrozen());
		// Step7
		heath.completeTask();
		System.out.println(heath.getnumTasks());
		// Step8
		heath.completeTask();
		System.out.println(heath.getnumTasks());
		System.out.println(heath.getSusLevel());
		// Step9    Needs review
		heath.completeTask();
		System.out.println(heath.getnumTasks());
		System.out.println(heath.getSusLevel());
		// Step10
		liam.freeze(angel);
		System.out.println(angel.isFrozen());
		System.out.println(liam.getSusLevel());
		// Step11
		liam.sabotage(bob);
		System.out.println(bob.getSusLevel());
		liam.sabotage(bob);
		System.out.println(bob.getSusLevel());

		
		}

}