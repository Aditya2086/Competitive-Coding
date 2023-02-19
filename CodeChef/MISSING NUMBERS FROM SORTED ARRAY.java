import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
         System.out.println("Enter Size Of Array :- ");
         int size=sc.nextInt();
         System.out.println("Enter Array :- ");
         int arr[]=new int[size];
         for(int i=0;i<size-1;i++)
         {
             arr[i]=sc.nextInt();
         }
         int j=0,k=arr[0];
       
         while(j<size-1)
         {   
             if(arr[j]==k)
              {j++;}
             else
            { 
            System.out.println("Missing Number is :- " + k);
            }
            k++;
         }  
    
