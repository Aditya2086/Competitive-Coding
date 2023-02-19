import java.util.*;
import java.lang.*;
import java.io.*;

class RCBPLAY
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sr=new Scanner(System.in);
        int t=sr.nextInt();
        while(t-->0){
        int x=sr.nextInt();
        int y=sr.nextInt();
        int z=sr.nextInt();
        int a=y-x;
        int b=z*2;
        if(a>b)
              System.out.println("NO");
        else 
              System.out.println("YES");
        }
    }
}
