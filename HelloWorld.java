
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
		int a = 5;
		int b = 6;
		int c = a + b;
		
		double d = 18.9, e = 123.4;
		double f = d + a;
		// you cannot put a double into an int: ie int 7 = f + a; must put cast
		int z = (int)d + a; //truncation (does not round)
				
		String name = "Alex";
		
		//operators
			//logical operators
		System.out.println( "a is " + a );//concatination
		System.out.println( a + 5 ); //addition
		System.out.println( a - 5 ); //subtraction
		System.out.println( a * 5 ); //multiplication
		System.out.println( a / 5 ); //division
		System.out.println( a % 5 ); //modulus rule if a is less than b it = a
		
			//compound operators
		a = a + 5; // a+=5
		System.out.println(a);
		a = a - 5; // a-=5
		System.out.println(a);
		a = a * 5; // a*=5
		System.out.println(a);
		a = a / 5; // a/=5
		System.out.println(a);
		a = a % 5; // a%=5
		System.out.println(a);
		
		
		a++; // ++ is += 1
		System.out.println(a);
		a--; // -- is -= 1
		System.out.println(a);
		
		//boolean operators
		/*
		 * > greater than
		 * < less than
		 * <= greater/equal to
		 * >= less/equal to
		 * == equals
		 * != doesn't equal
		 */
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
				
	}

}
