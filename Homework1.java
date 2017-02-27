/**
 * Homework 1 for CSC-281.001 Spring 2017
 *
 * Name: Vierna
**/
/** Please uncomment the problem you want to compile and execute **/
/**Problem 1**/
/*
import java.math.*;


public class Homework1 {

public static void main (String[] args) {

	Homework1 hw1= new Homework1();
	


	System.out.println("===Problem  1===");
	hw1.problem1();
	}
	
	public void problem1() {
	double result1= 5.0/4.0;
	System.out.println(result1);
	if(result1==1.25) {
		System.out.println("Problem1a: succesfully completed!");
	} else {
		System.out.println(" Problem1a: not quite right.");

	}
	
	double result2= Math.pow(4,2);
	if (result2== 16) {
		System.out.println("Problem1b: Successfully completed!");
	} else {
		System.out.println("Problem1b: not quite right!");
	}


	String strA= new String("foo");
	String strB= new String("foo");
	if (strA==strB) {
		System.out.println("Problem 1c: successfully completed!");
	} else {
		System.out.println("Problem 1c: not quite right!");

	}


}
*/
/**Problem 2**/

/*
public class Homework1 {
	public static double topInt(double a)//this method takes a double integer and rounds it up to next integer
 {
		return Math.ceil(a);
	}

	public static void main(String[] args) {
	Homework1 hw1= new Homework1();

	System.out.println("===Problem 2===");
	System.out.println(hw1.topInt(1.5));
	System.out.println(hw1.topInt(5.1));
	System.out.println(hw1.topInt(1.0));
	System.out.println(hw1.topInt(-4.2));
	
	}

}
*/

/**Problem 3**/
/*

public class Homework1 {

public static void main (String[] args) {
	Homework1 hw1= new Homework1();


	System.out.println("===Problem 3===");
	hw1.draw4x4('-');
	hw1.draw4x4('4');
	}
	public void  draw4x4 (char c)// draws a 4x4 box with data type char 
 {
		System.out.println (c+" "+c+" "+c+" "+c+"\n"+c+"   "+"  "+c+"\n"+c+"   "+"  "+c+"\n"+c+" "+c+" "+c+" "+c);
	}
}

*/





/** Problem 4 */
/*
public class Homework1 {
	public static void main(String[] args) {
		Homework1 hw1= new Homework1();

		System.out.println("===Problem 4===");
		System.out.println(hw1.citationName("Alastair", "Reynolds"));
		System.out.println(hw1.citationName("Grace", "Hopper"));
	}
	public static String citationName(String firstName,String lastName)//returns last name concatenated with comma and first letter of the first name
 {
		return (lastName +","+ firstName.charAt(0));
	}

}
*/

/** Problem 5 */

/*
public class Homework1 {
	public static void main(String[] args) {
		Homework1 hw1= new Homework1();

		System.out.println("===Problem5===");
		System.out.println(hw1.min3(1.0,2.0,3.0));
		System.out.println(hw1.min3(4.0,3.0,2.0));
		System.out.println(hw1.min3(0.5,0.1,0.5));
	}
	public static double min3(double a, double b, double c)// returns the minimum between three integers
 {
		return Math.min(Math.min(a,b), c);
	}
}


*/
/** Problem 6 */
/*
public class Homework1 {
	public static void main(String[] args) {
		Homework1 hw1= new Homework1();


		System.out.println("===Problem6===");
		System.out.println(hw1.fibonacci(0));
		System.out.println(hw1.fibonacci(1));
		System.out.println(hw1.fibonacci(2));
		System.out.println(hw1.fibonacci(3));
		System.out.println(hw1.fibonacci(10));
		System.out.println(hw1.fibonacci(25));
	}
	public static int fibonacci(int n) // calculates the fibonacci series {	
		int previous=0, next=1, result=0;
		for (int i=0; i<n; i++) {	
			result=previous+next;
			previous=next;
			next=result;
		}

		return result;
	}
}
*/
/** Problem 7*/

/*
public class Homework1 {
	public static void main(String[] args) {
	Homework1 hw1= new Homework1();

	System.out.println("===Problem7===");
	System.out.println(hw1.isPalindrome("racecar"));
	System.out.println(hw1.isPalindrome("cat"));
	System.out.println(hw1.isPalindrome("hannah"));
	System.out.println(hw1.isPalindrome("saippuakivikauppias"));

}
	public boolean isPalindrome(String a)// returns true if a string is a palindrome 
 {
		int aLength= a.length();		
		for (int i= 0; i< aLength/2; i++) {	
			if (a.charAt(i) != a.charAt(aLength -1 -i)) {	
				return false;
			}
		}
		return true;
	}
}


}				

*/







