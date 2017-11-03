//Jake Yee
//10/31/17


public class ArraysLab3 {
	public static void main(String[] args) {
	}
		
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];
		for (i = 0; i < arr1.length; i++) {
			arr3[i] = arr2[i] + arr1[i];
		}
		return arr3
	}
	
	public static int[] append(int[] arr, int num) {
		int[] arrNew = new int[arr.length];
		for (i=0; i < arr.length; i++) {
			new array[i] = append [i];
		}
		new array [i+1] = num
		return arrNew
	}
	
	public static int[] remove(int[] arr, int idx) {
		int[] arr4 = new int[arr.length - 1];
		for (i = 0; i <idx; i++) {
			arr4[i] = arr[i];
		}
		for (i = idx + 1; i <= arr.length-1; i++) {
			arr4[i] = arr[i+1];
		}
	}
	
	public static int sumEven(int[] arr) {
		int sumEven = 0;
		for (i = 0; i <= arr.length/ 2; i ++) {
			sumEven += array[2i];
		}
		return sumEven
	}

	public static void rotateRight(int[] arr) {
		int last = list[arr.length - 1];
		for(int i = arr.length  - 1; i >= 0; i--) {
			arr[i] = arr[i-1];
		}
		list[0] = last;
	}
	
	
	}

}
