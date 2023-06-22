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
		    int C = input.nextInt();
		    
		    if (A > B && A > C) {
		        System.out.println("Alice");
		    }
		    else if (B > A && B > C) {
		        System.out.println("Bob");
		    }
		    else if (C > A && C > B) {
		        System.out.println("Charlie");
		    }
		}
	}
}
