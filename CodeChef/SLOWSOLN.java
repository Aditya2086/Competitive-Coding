/* package codechef; // don't place package name! */

import java.util.Scanner;
class Codechef {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++) {
            int maxT = sc.nextInt();
            int maxN = sc.nextInt();
            int sumN = sc.nextInt();
            int a=0;
            while(maxT>0 && sumN!=0) {
                int N = Math.min(maxN,sumN);
                a += N*N;
                maxT--;
                sumN -= N;
            }
            System.out.println(a);
            }
          }
        }

