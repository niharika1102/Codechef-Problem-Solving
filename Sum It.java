/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		
		for (int i = 0; i < testCase; i++) {
		    int A = input.nextInt();
		    int B = input.nextInt();
		    int inputSum = input.nextInt();
		    
		    int sum = A + B;
		    if (sum == inputSum) {
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
