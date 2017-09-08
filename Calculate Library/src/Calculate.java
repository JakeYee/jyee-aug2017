//Jake Yee
//Sept 5, 2017
//This is our home grown library that will contain various mathematical methods.

public class Calculate {

/* This method takes an integer and returns its square.
 */
	public static int square(int operand) {
		return operand * operand;
	}
	
	// This method takes an interger and returns its cube
	public static int cube(int operand) {
		return operand * operand * operand;
	}
		
	//This method returns the mean value of two doubles
	public static double average(double operand1, double operand2) {
		return (operand1 + operand2)/2;
	}
	
	//This method returns the mean value of three doubles
	public static double average(double operand1, double operand2, double operand3) {
		return (operand1 + operand2 + operand3)/3;
	}
	
	//This method converts a radians to degrees
	public static double toDegrees(double radians) {
		return radians * 180 / 3.14159;
	}
	
	//This method converts a degrees to radians
	public static double toRadians (double degrees) {
		return degrees * 3.14159 / 180;
	}
	
	//This method calculates the discriminant from three doubles a,b, and c
	public static double discriminant (double a, double b, double c) {
		return Math.sqrt(b *b - 4 * a * c);
	}
	
	//This method converts a mixed number into an improper fraction
	public static String toImproperFrac(int x, int y, int z) {
		return x * z + y + "/" +  z;
	}
	
	//This method converts an improper fraction to a mixed number
	public static String toMixedNum(int a, int b) {
		return a/b + "_" + a%b + "/" + b;
	}
	
	//This method converts a binomial multiplication in foil form
	public static String foil(int a, int b, int c, int d) {
		return a*c + "x^2"+ ((a*d) + (b*c)) + "x" + b*d;
	}
	
	
	
	
}
	