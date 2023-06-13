/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception {
		Scanner input = new Scanner(System.in);
		
		int testCase = input.nextInt();
		
		for (int i = 0; i < testCase; i++) {
		    int num1 = input.nextInt();
		    int num2 = input.nextInt();
		    
		    int sum = num1 + num2;
		    
		    if (sum > 6) {
		        System.out.println("YES");
		    }
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
