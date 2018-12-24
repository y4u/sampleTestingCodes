package reader;

public class SumOfRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLLessThanN(876, 8,7,6)); //input 876  -> output : 599 
 /*  * * * *
  *    * * *
  *      * *
  *        *
  *        
  *     Solution for Above Pattern
  * */

		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	 static int getLLessThanN(int number, int digit,int digit1,int digit2)
	    {
	        //Converting digit to char
	        char c = Integer.toString(digit).charAt(0);
	        char d = Integer.toString(digit1).charAt(0);
	        char e = Integer.toString(digit2).charAt(0);
	        //Decrementing number & checking whether it contains digit
	        for (int i = number; i > 0; --i)
	        {
	            if(Integer.toString(i).indexOf(c) == -1 && Integer.toString(i).indexOf(d) == -1 && Integer.toString(i).indexOf(e) == -1)
	            {
	                //If 'i' doesn't contain 'c'
	                return i;
	            }
	        }
	        return -1;
	    }
	 // calculate the sum of Fibonacci Series
	 static int calculateSum(int n) 
	    { 
	        if (n <= 0) 
	           return 0; 
	       
	        int fibo[]=new int[n+1]; 
	        fibo[0] = 0; fibo[1] = 1; 
	       
	        // Initialize result 
	        int sum = fibo[0] + fibo[1]; 
	       
	        // Add remaining terms 
	        for (int i=2; i<=n; i++) 
	        { 
	            fibo[i] = fibo[i-1]+fibo[i-2]; 
	            sum += fibo[i]; 
	        } 
	       
	        return sum; 
	    } 
	 //prime numbers from 2 to N using Recursion 
	 
	 public int primes(int x, int i)
	 {
	     if(i==1)
	         return 1;
	     if(x%i==0)
	         return 0;
	     else
	         return primes(x, i-1);
	 }
	 //sum of digits of a number using recursion 
	 /* int sum = 0;
	    public static void main(String[] args) 
	    {
	        int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        n = s.nextInt();
	        Digit_Sum obj = new Digit_Sum();
	        int a = obj.add(n);
	        System.out.println("Sum:"+a);
	    }
	    int add(int n)
	    {
	        sum = n % 10;
	        if(n == 0)
	        {
	            return 0;
	        }
	        else
	        {
	             return sum + add(n / 10);
	        }
	 
	    }*/
	  
}
