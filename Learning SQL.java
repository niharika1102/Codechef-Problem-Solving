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
		Scanner input = new Scanner (System.in);
		
		int R = input.nextInt();
		int C = input.nextInt();
		int E = input.nextInt();
		
		int rows = R + E;
		int total = rows * C;
		System.out.print(total);
	}
}
