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
		    int X = input.nextInt();
		    int H = input.nextInt();
		    
		    if (X >= H) {
		        System.out.println("YES");
		    }
		    
		    else {
		        System.out.println("NO");
		    }
		}
	}
}
