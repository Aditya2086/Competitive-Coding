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
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0 ; i<T ; i++) {
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		float die = ((float) N/B)*Y;
		float pet = ((float) N/A)*X;
		        
		if(die == pet){
		System.out.println("ANY");
		} 
		else if(pet > die) {
		System.out.println("DIESEL");
		} 
		else {
		System.out.println("PETROL");
		}
	 }
  }
}