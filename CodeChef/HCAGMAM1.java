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
		Scanner sc=new Scanner(System.in);
		int t,x,y;
		t=sc.nextInt();
		while(t-->0)
		{
		    x=sc.nextInt();
		    y=sc.nextInt();
		    String str=sc.next();
		    int count=0,a=0;
		    int b=0;
		    for(int i=0;i<30;i++)
		    {
		    if(str.charAt(i)=='1')
		    {
		    count++;
		    a++;
		    }
		    else
		    {
		    if(b<count)
		    {
		    b=count;
		    }
		    count=0;
		    }
		    }
		    if(b<count)
		    {
		    b=count;
		    }
		    count=0;
		    System.out.println(x*a + y*b);
		}
	}
}