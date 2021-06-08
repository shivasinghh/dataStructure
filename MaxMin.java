// Find the maximum and minimum element in an array

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxMin
{
   static int max;
   static int min;
    
    public static void maxMin(int a[],int n){
        
        int i;
        if(n%2==0){
            if(a[0]<a[1]){
                 min = a[0];
                 max= a[1];
            }
            else {
                min = a[1];
                max = a[0];
            }
            i=2;
        }
        else {
            min =a[0];
            max= a[1];
              i=1;
        }
      
        while(i<n-1){
            if(a[i]<a[i+1]){
                if(a[i]<min){
                    min=a[i];
                }
                if(a[i+1]>max){
                    max = a[i+1];
                }
             }
                else {
                    if(a[i+1]<min){
                        min = a[i+1];
                    }
                    if(a[i]>max){
                        max = a[i];
                    }    
                }
            
             i=i+2;
        }
    }
	public static void main (String[] args)
	{
	   int a[] = {2,45,-1};
	   int n = 3;
	   maxMin(a,n);
	   
	   System.out.println(max + " is max and  min is "+ min);
	}
}
