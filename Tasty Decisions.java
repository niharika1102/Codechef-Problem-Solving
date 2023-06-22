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
		    int chocolate = input.nextInt();
		    int candy = input.nextInt();
		    
		    int tasteChocolate = chocolate * 2;
		    int tasteCandy = candy * 5;
		    
		    if (tasteCandy > tasteChocolate) {
		        System.out.println("Candy");
		    }
		    else if (tasteChocolate > tasteCandy) {
		        System.out.println("Chocolate");
		    }
		    else {
		        System.out.println("Either");
		    }
		}
	}
}
