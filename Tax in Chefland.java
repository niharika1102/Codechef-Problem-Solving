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
	        int income = input.nextInt();
	        
	        int left = 0;
	        
	        if (income <= 100) {
	            left = income;
	        }
	        
	        else {
	            left = income - 10;
	        }
	        
	        System.out.println(left);
	    }
	}
}
