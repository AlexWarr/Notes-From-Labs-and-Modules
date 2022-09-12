
public class Conditionals {

	public static void main(String[] args) {
		// Notes taken from video
		String name = "Sam";
		
		if (name == "Sam") {
			System.out.println("Hello Sam!");
		} else {
			System.out.println("You are not Sam, " + name);
		}
		
		int age = 13;
		
		if (age >= 16) {
			System.out.println("You can get your license!");
		} else {
			System.out.println("Please wait " + (16 - age) + " years to get your license");
		}
		
		double costOfMilk = 2;
		
		if(costOfMilk <=2) {
			System.out.println("Buying 2");
		} else if (costOfMilk <= 3) {
			System.out.println("Buying 1");
		} else {
			System.out.println("Not buying any milk.");
		}
		
	
		char grade = 'A';
		
		switch (grade) {
			case 'D':
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
		}
		
		if (5 == 5) {
			if (4 == 3) {
				System.out.println("5 is 5 and 4 is 3");
			} else {
				System.out.println("5 is 5");
			}
		}
		
		if (5 == 5 && 4 == 4) {
			System.out.println("Yes");
		}
		
	}

}
