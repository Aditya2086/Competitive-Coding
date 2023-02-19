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
        int T=sc.nextInt();
        while(T-->0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            int max = Integer.MIN_VALUE;
            int count[] = new int[10];
            for(int i=0;i<N;i++){
                a[i] = sc.nextInt();
                count[a[i]-1]+=1;
            }
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i< count.length;i++){
                if(count[i]!=0) {
                    if (!map.containsKey(count[i]))
                        map.put(count[i], 1);
                    else
                        map.put(count[i], map.get(count[i]) + 1);
                }
            }
            int x = 0;
            for(Map.Entry<Integer,Integer>mp:map.entrySet()){
                if(max<mp.getValue()) {
                    x = mp.getKey();
                    max = mp.getValue();
                }
                else if(max==mp.getValue()){
                    x=Math.min(x,mp.getKey());
                }
            }
            System.out.println(x);
        }
	}
}
