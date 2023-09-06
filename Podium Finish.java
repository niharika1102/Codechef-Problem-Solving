/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception {
		Scanner input = new Scanner (System.in);
		
		int testCase = input.nextInt();
		
		for (int i = 0; i < testCase; i++) {
		    int A = input.nextInt();
		    int B = input.nextInt();
		    
		    int total = A + B;
		    System.out.println(total);
		}
	}
}
