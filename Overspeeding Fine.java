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
		    int speed = input.nextInt();
		    
		    int fine = 0;
		    
		    if (speed <= 70) {
		        System.out.println(fine);
		    }
		    else if (speed > 70 && speed <= 100) {
		        fine = 500;
		        System.out.println(fine);
		    }
		    else {
		        fine = 2000;
		        System.out.println(fine);
		    }
		}
	}
}
