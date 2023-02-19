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
	    int t = sc.nextInt();
	    while(t > 0){
	    int n = sc.nextInt();
	    int min = 10000;
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++){
	    arr[i] = sc.nextInt();
	    }
	    String s = sc.next();
	    for(int j = 0; j < n; j++){
	    if(s.charAt(j) == '0'){
	    if(arr[j] < min) {
	    min = arr[j];
	    }
	    }
	    }
	    System.out.println(min);
	    t--;
	    }
	}
}