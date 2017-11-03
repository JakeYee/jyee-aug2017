//Jake Yee
//Sept 5, 2017
//This is the runner class for my calculate Library methods

public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5, 10));
		System.out.println(Calculate.average(3, 4, 5));
		System.out.println(Calculate.toDegrees(6.28));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(1, 5, 2));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(1, 3, 1, 3));
		System.out.println(Calculate.isDivisibleBy(10, 5));
		System.out.println(Calculate.absValue(-9));
		System.out.println(Calculate.max(10, 15));
		System.out.println(Calculate.max(10, 15, 20));
		System.out.println(Calculate.min(8, 9));
		System.out.println(Calculate.exponent(7, 4));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(29));
		System.out.println(Calculate.gcf(10, 25));
		System.out.println(Calculate.sqrt(9));
		System.out.println(Calculate.quadForm(1, 0, 9));
		
	}

}
