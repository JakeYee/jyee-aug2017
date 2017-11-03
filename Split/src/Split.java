import java.util.Arrays;

//Jake Yee
//10/27/17


public class Split {
	public static void main(String[] args) {
		//Your task Part 1:
		/*Write a method that take in a string like
		* "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		* use String.split to split up the sandwich by the word "bread" and 
		* return what's in the middle of the sandwich and ignores what's on the outside
		* What if it's a fancy sandwich with multiple pieces of bread?
		*/
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
		System.out.println(Arrays.toString("really 1 really 2really 3 really 4".split("really")));
		
		String[] arr1="I like apples!".split(""); //puts the result from split into an array
		System.out.println(Arrays.toString(arr1)); //use toString to print the array
		
		String[] arr2="applespineapplesbreadlettustomatobaconmayohambreadcheese".split("");
		System.out.println(Arrays.toString(arr2));
		
		String[] arr3="applespineapplesbreadlettustomatobaconmayohambreadcheese".split("bread");
		System.out.println(Arrays.toString(arr3));

		
				
				
				
				
				//public static void getTheFilling( String everything) {
				//everything = "applespineapplesbreadlettustomatobaconmayohambreadcheese"
		/*if (everything.indexOf("bread")< 0);
		
		
			filling = "\"" + everything + "\"" + "is not a sandwich";
			else {
				filling= 
			}
		*/

		
	}
}
