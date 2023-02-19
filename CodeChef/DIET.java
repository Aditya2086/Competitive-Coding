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
		int t = sc.nextInt();
		for(int tc=0 ; tc<t ; tc++){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[n];
		    for(int j=0 ; j<n ; j++){
		    arr[j] = sc.nextInt();
		    }
		    int count = 1 , i=0, rem=0;
		    while(i<n && arr[i]+rem-k>=0){
		    rem = arr[i]+rem-k;
		    count++;
		    i++;
		    }
		    if(i==n) {
		    System.out.println("YES");
		    }
		    else {
		    System.out.println("NO " + count);
		    }
		}
	}
}
