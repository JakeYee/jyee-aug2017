//Jake Yee
//Sept 5, 2017
//This is our home grown library that will contain various mathematical methods.
//this will be the BEST calculate library EVER:-) !!!!!!

public class Calculate {

/* This method takes an integer and returns its square.
 */
	public static int square(int operand) {
		return operand * operand;
	}
	
	// This method takes an integer and returns its cube
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
		return a*c + "x^2 + " + ((a*d) + (b*c)) + "x + " + b*d;
	}
	
	//This method determines whether an integer is evenly divisible by another
	//pre: b !=0
	//post: decides whether a value is divisible or not
	public static boolean isDivisibleBy (int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException();
		} else {
		if (a%b==0) {
			return true;
		}
		else {
			return false; }
		}
	}
	
	//This method returns the absolute value of a number passed
	public static double absValue(double a) {
		if (a<0) {
			return a* -1;
		}
		else {
			return a;
		}
	}
	
	//This method returns the larger of a value passed
	public static double max(double a, double b) {
		if (a<b) {
			return b;
		} else {
			return a;
		}
	}

	//This method overloads the max method
	public static double max(double a, double b, double c) {
		if (a > b && a>c) {
			return a;
		} else {
			if (b>c) {
				return b;
			} else {
				return c;
			}
		}
	}
	
	//This method returns the smaller value
	public static int min(int a, int b) {
		if (a<b) {
			return a;
		} else {
			return b;
		}
	}
	
	//This method rounds a double to 2 decimal places
	public static double round2(double x) {
		if (x *1000 %10 <5) {
			return ((x*1000) - (x * 1000) % 10 )/ 1000;
		} else {
			return ((x * 1000) - ((x * 1000 % 10)) + 10)/1000;
		}
	}
	
	//This method raises a value to a positive integer power
	//pre: a > 0
	//post: positive integer power
	public static double exponent( double a, int b) {
		if (a < 0) {
			throw new IllegalArgumentException();
		} else {
		double power = a;
		double i = 1;
		while (i < b) {
			a = a * power;
			i++; }
		return a; }
	}
	
	//This method returns a factorial of a value
	//pre: x > 0
	//post: positive factorial
	public static int factorial(int x) {
		int factor;
		factor = x-1;
		if (x< 1) {
			throw new IllegalArgumentException();
		//exception works!
		//continue with program
		} else {
		while(factor >= 1) {
			x = factor * x;
			factor--;}
		return x; }
}
	
	//This method determines whether or not an integer is prime
	public static boolean isPrime(int x) {
		int factorCount = 1;
		for (int i = 2; i < x; i++) {
			boolean test = isDivisibleBy(x, i);
			if (test == true) {
				factorCount++;
			}
		}
		if (factorCount > 1) {
			return false;
		} else {
			return true;
		}
	}
	
	//This method finds the greatest common factor of two integers
	public static int gcf(int A, int B) {
		int result;
		while (B != 0) {
			result = A % B;
			A = B;
			B = result;
		}
		return A;
	}
	
	//This method returns the square root of an integer, rounded to two decimal places
	//pre: x > 0
	//post: square root value
	public static double sqrt(int x) {
		if (x < 0) {
			throw new IllegalArgumentException();
		} else {
		double root = 0;
		double A = x / 2; //just a guess
		while (root != (x / A + A) / 2) { //because we WANT the root to equal this
			root = (x / A + A) / 2; } //actual calculations
			A = root;
		double answer = round2(root);
		return answer; }
	}


	//This method uses the coefficients of a quadratic equation in standard form and uses
	//the quadratic formula to approximate the real roots, if any
	//accepts three integers, returns a string
	public static String quadForm(int a, int b, int c) {
		String answer = "";
		if(discriminant(a,b,c) < 0) {
			answer += "no real roots";
		}else if (discriminant(a,b,c) == 0) {
			answer += round2(-b/(2*a));
		}else {
			double answer1 = ((-b + sqrt(discriminant(a,b,c)))/(2*a));
			double answer2 = ((-b - sqrt(discriminant(a,b,c)))/(2*a));
			answer += round2(answer1) + " and " + round2(answer2);
		}
		return answer;
		}
}
	
	
	
	
	
	
	
	
	
	
	


	