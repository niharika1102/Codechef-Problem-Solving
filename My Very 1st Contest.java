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
		
		int N = input.nextInt();
		int A = input.nextInt();
		int B = input.nextInt();
		
		int rank1 = N - A;
		System.out.println(rank1);
		
		int rank2 = rank1 - B;
		System.out.println(rank2);
	}
}
