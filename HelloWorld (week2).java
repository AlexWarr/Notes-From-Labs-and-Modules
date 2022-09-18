import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// Comment
		/* Multi
		 * Line
		 * Comment

		System.out.println("Hello World"); //prints on line, kicks to next line
		System.out.print("hello"); //prints on line

		//primitive variables
		// byte 8-bit
		byte a; //declaration
		a=6; //initialization
		//byte b = 18;
		// short 16-bit
		short b = 15;
		
		// int 32-bit
		int c = 234564;
		
		//long 64-bit
		long d = 8973284;
		
		//floating point or precision 32-bit
		float e =  5.65f;
		
		double f = 76.5;
		f=5;
		System.out.println("\n"+f);
		
		System.out.println (f);
		*/
		//int a = 5;
		//int b = 6;
		//int c = a + b;
		
		//double d = 18.9, e = 123.4;
		//double f = d + a;
		// you cannot put a double into an int: ie int 7 = f + a; must put cast
		//int z = (int)d + a; //truncation (does not round)
				
		//String name = "Alex";
		
		//operators
			//logical operators
		//System.out.println( "a is " + a );//concatination
		//System.out.println( a + 5 ); //addition
		//System.out.println( a - 5 ); //subtraction
		//System.out.println( a * 5 ); //multiplication
		//System.out.println( a / 5 ); //division
		//System.out.println( a % 5 ); //modulus rule if a is less than b it = a
		
			//compound operators
		//a = a + 5; // a+=5
		//System.out.println(a);
		//a = a - 5; // a-=5
		//System.out.println(a);
		//a = a * 5; // a*=5
		//System.out.println(a);
		//a = a / 5; // a/=5
		//System.out.println(a);
		//a = a % 5; // a%=5
		//System.out.println(a);
		
		
		//a++; // ++ is += 1
		//System.out.println(a);
		//a--; // -- is -= 1
		//System.out.println(a);
		
		//boolean operators
		/*
		 * > greater than
		 * < less than
		 * <= greater/equal to
		 * >= less/equal to
		 * == equals
		 * != doesn't equal
		 */
		//System.out.println(a < b);
		//System.out.println(a > b);
		//System.out.println(a <= b);
		//System.out.println(a >= b);
		//System.out.println(a == b);
		//System.out.println(a != b);
		
		//int a = 5, b = 6;
		
		//System.out.println(a < b);
		
		
	//Scanners (User input)
		
		String x = "alex"; //String x = new String "Alex"
		
		Scanner kb = new Scanner(System.in);
		/*
			//Storing ints
		System.out.println("how old are you?");
		int age = kb.nextInt();
		System.out.println("Oh, " + age + " is not that old\n");
		
			//Storing double
		System.out.println("What is your GPA?");
		double gpa = kb.nextDouble();
		System.out.println("wow! " + gpa + " is a great GPA!");
		
			//Storing SINGLE words
		System.out.println("what is your name?");
		String fname = kb.next();
		System.out.println("hi " + fname);
		
			//store multiword string
		System.out.println("what is your full name?");
		String name = kb.nextLine();
		System.out.println("hi " + name);
		*/
		//Storing ints
//		System.out.println("how old are you?");
//		int age = Integer.parseInt( kb.nextLine() );
//		System.out.println("Oh, " + age + " is not that old\n");
	
			//Storing double
//		System.out.println("What is your GPA?");
//		double gpa = Double.parseDouble( kb.nextLine() );
//		System.out.println("wow! " + gpa + " is a great GPA!");
		/*
			//Storing SINGLE words
		System.out.println("what is your name?");
		String fname = kb.next();
		System.out.println("hi " + fname);
		 */
			//store multiword string
//		System.out.println("what is your full name?");
//		String name = kb.nextLine();
//		System.out.println("hi " + name);
		
	//if statements
		/*
		System.out.println("how old are you?");
		int age = kb.nextInt();
		
		if( age >= 21 ) { //brackets attach everything, no brackets means only next line is conditional
			System.out.println("welcome to da club!!");
			//System.out.println("Pockets full of Dubs!");
		} else { // can also do not brackets if simple if/else
			System.out.println("piss off!");
		}
		System.out.println("Tell me a number, I'll tell you if it's even or odd");
		int guess = kb.nextInt();
		
		if( guess % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		System.out.println("Guess my number. 1-10");
		int guess2 = kb.nextInt();
		int num = (int)(Math.random() * 10 + 1);
		//System.out.println(num);
		
		if( guess2 > num) {
			System.out.println("too high");
		} else if (guess < num) {
			System.out.println("too low");
		} else {
			System.out.println("You got it!");
		}
		//the following works but is extremely innefficient:
		//else if (guess == num) {
		//	System.out.println("You got It!");
		//}
		*/
	//for loop
		System.out.println("Guess my number. 1-10");
		int num = (int)(Math.random() * 10 + 1);
		//System.out.println(num);
		for(int j = 0; j < 5; j++ ) {//j is local
			System.out.println("Take a guess");
		//also writen
		//int j = 0; //j is no longer local
		//for(; j < 5; j++ ) {
			//System.out.println("help");
			
			int guess2 = kb.nextInt();
			
			
			
			if( guess2 > num) {
				System.out.println("too high");
			} else if (guess2 < num) {
				System.out.println("too low");
			} else {
				System.out.println("You got it!");
				break;
			}
		}
		
	//while loop
		int wh = 0;
		while (wh < 5) {
			System.out.println("help");
			wh++;
			
		}
		/*
		 * boolean run = true;
		 * while(run) {
		 * 	if
		 * 	else if
		 *  else 
		 *  	run = false OR break
		 * 
		 * {
		 */
	}

}
