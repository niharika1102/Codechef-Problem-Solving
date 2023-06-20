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
		    int n1 = input.nextInt();
		    int n2 = input.nextInt();
		    int n3 = input.nextInt();
		    
		    ArrayList <Integer> al = new ArrayList<>();
		    al.add(n1);
		    al.add(n2);
		    al.add(n3);
		    
		    Collections.sort(al);
		    
		    int second = al.get(1);
		    System.out.println(second);
		}
	}
}
