/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T --> 0) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = (x + y) / 2;
		if(x < y) {
		System.out.println(y - a);
		}
	    else {
		System.out.println(x - a);
		}
	  } 
   }
}