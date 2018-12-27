package basics;

public class Functions {

	public static void main(String[] args) {
		//Write a function that takes a value n returns the sum of numbers 1 to n
		System.out.println(sum(5));
		//Write a function that computes the factorial value
		System.out.println("Factorial: " + fact(5));
		//Write a function that returns the min, avg, and max of an array
		int[] numbers = {6, -4, 6, 100, 400, -250};
		System.out.println("Min: " + findMin(numbers);
		System.out.println("Max: " + findMax(numbers);
		System.out.println("Avg: " + findAvg(numbers);
	}
	public static int findMn(int[] arr){
		int min = arr[0];
		for (int i = 0, i< arr.length; i++){
			if (arr[i] < min){
			   min = arr[i];
			}
		}
		return min;
	}
			public static int findMax(int[] arr){
		int max = arr[0];
		for (int i = 0, i< arr.length; i++){
			if (arr[i] > max){
			   max = arr[i];
			}
		}
		System.out.println("Sum: " + sum);
		return max;
	}
				   
	public static int findAvg(int[] arr){
	    //Take sum, divide by number of elements
	    int sum = 0;
	    for (int n = 0; n < arr.length; n++){	
		sum = sum + arr(n);
	        
	    }
	    return sum/arr.length;
	
	}			   
	
	public static int sum(int x) {
		int sum = 0;
		for (int y = 1; y <= x; y++) {
			sum = sum + y;
			System.out.println(" * " + sum);
		}
		return sum;
		}
		
	public static int fact(int n){
		if (n == 0){
			return 1;
		}
		System.out.println(n);
		return fact(n-1) * n;
	}
		
}
