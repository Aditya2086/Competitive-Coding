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
		int t= sc.nextInt(); 
		for(int i=1;i<=t;i++){ 
		int a;
		int N = sc.nextInt(); 
		int B = sc.nextInt();
		a = 0;
		
		for(int j= 1;j<=N;j++){
		int W = sc.nextInt(); 
		int H = sc.nextInt();
		int P = sc.nextInt(); 
	
		if((P<=B)&&(W*H>a)){
		a = W*H;
		}
		} 
		if(a==0) {
		System.out.println("no tablet");
		}
		else {
		System.out.println(a);
		}
	  }
   }
}