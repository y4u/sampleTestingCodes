import java.util.Arrays;

public class MainRunner {

	private static int count;

	public static void main(String[] args) {

		/*
		 * InterfaceTest ia= new A(); ia.buildHouse();
		 * 
		 * A a = new A(); a.buildHouse(); a.buildFoundation(); InterfaceTest ib= new
		 * B(); ib.buildHouse();
		 * 
		 * B b = new B(); b.buildHouse();
		 */

		System.out.println(doExceptionPhaseCheck());
		duplicateNumbers();
		System.out.println(doCount());
		findMissingInArray();
		System.out.println(firstNonRepeating());
		comparingArrays();
		smallAndLargestElementInArray();
		System.out.println();
		//calling removing duplicate methods
		System.out.println("calling removeDuplicate Method\r\n" );
	    int arr[] = {3, 3, 4, 4, 5, 1, 1, 2, 2, 5 , 5};
	    int length = arr.length;
	     length= removeDuplicates(arr,length);
	    for(int i=0 ; i < length-1 ; i++ )
	    	System.out.println(arr[i]);

	}

	private static int  removeDuplicates(int a[], int n ) {
		// TODO Auto-generated method stub
		int j=0;
		for(int i=0 ; i< n-1 ; i++ )
			if(a[i]!=a[i+1])
				a[j++]=a[i];
		
		a[j++]=a[a.length-1];
		return j;
	}

	private static void smallAndLargestElementInArray() {
		int arr[] = {  34, 1,  58, 9, 23, 85, 22, 2, 5, 103  };
		int min =arr[0];
		int max =arr[0];
		
		System.out.println("***finding Smallest and Biggest element in array ***");

		for(int i=0 ; i < arr.length ; i++) {
			if( arr[i] > max )
				max=arr[i];
			if( arr[i] < min )
				min=arr[i];		
		}
		System.out.println("smallest Element is " + min);
		System.out.println(" Biggest Element is " + max);

	}

	private static void comparingArrays() {
		System.out.println("***two arrays Comparison  ***");

		int inputArray1[] = { 1, 2, 3 };
		int inputArray2[] = { 1, 2, 3 };
		int count = 0;
		//first Version
		if (inputArray1.length == inputArray2.length) {
			for (int i = 0; i < inputArray1.length; i++)
				if (inputArray1[i] == inputArray2[i])
					count++;
			if (count == inputArray2.length)
				System.out.println(" true ");
			else
				System.out.println(" false ");
			System.out.println();
		}
		//fourth version
		if(inputArray1.equals(inputArray2))
			System.out.println(" Array Comparison Success ");
		else
			System.out.println("failure");
		System.out.println();
		
		//second Version
		if(Arrays.equals(inputArray1, inputArray2));
				System.out.println("true");
		System.out.println();
				
		// third Version 
		Object[] a1= {inputArray1};
		Object[] a2= {inputArray2};
		if(Arrays.deepEquals(a1, a2));
				System.out.println("true");
		System.out.println();			
	}

	static int firstNonRepeating() {
		System.out.println("***finding first non-repeating element ***");
		int arr[] = { 9, 4, 9, 5,5 ,7, 7, 4 };

		for (int i = 0; i < arr.length; i++) {
			int j;
			System.out.println("11111111111");
			for (j = 0; j < arr.length; j++) {
				if ( i != j && arr[i] == arr[j] ) {
					System.out.println("22222222222");
					break ;
				}
				}
				if (j == arr.length)
					return arr[i];
			}
		
		return -1;
	}

	private static void findMissingInArray() {
		System.out.println("****Finding Missing number in an Array of Continuous numbers ****");

		int x[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		int n = x.length;
		int sum = 0;
		int total = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < n; i++) {
			sum = sum + x[i];
		}
		System.out.println(sum);
		System.out.println(total - sum);

	}

	public static void duplicateNumbers() {
		System.out.println("****Finding duplicate elements in an Array  ****");
		// it will only for if element repeated twice only
		// if element repeated more that two times it will give Wrong result
		int a[] = { 1, 1, 4, 4, 5, 5 };
		int dup[] = null;
		int k = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (k = i + 1; k < a.length; k++) {
				if (a[i] == a[k] && (i != k)) {
					System.out.println(a[k]);
					break;
				}
			}
		}
	}

	public static int doCount() {

		System.out.println("***Counting the input String characters occurences ***");
		String s = "abcd";
		String s1 = "abef";
		// String s1= "ab" ;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				char v = s1.charAt(i);
				// System.out.println( c+" = " +v );
				if (v == c) {
					count += 1;
					//
				}
			}
		}
		return count;
	}

	@SuppressWarnings("finally")
	private static String doExceptionPhaseCheck() {
		System.out.println("***Checking the Exception blocks priorioty***");

		try {
			int j = 10 / 0;
			return "try Block Priority";
		} catch (Exception ex) {
			return "Catch Block Priority";
		} finally {
			return "finally Block Priority ";
		}

	}

}
