//Find the maximum and minimum element in an array

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxMinSecond
{
    static int max;
    static int min;
    
    static void maxMin(int arr[],int n){
    
        if(n==1){
            min=arr[0];
            max=arr[0];
        }
         
         if(arr[0]>arr[1]){
             min=arr[1];
             max=arr[0]; 
         }
         else {
              min=arr[0];
              max=arr[1];
         }
        
        for(int i=2;i<n;i++){
            
            if(arr[i]>max){
             max=arr[i]; 
         }
         else if (arr[i]<min){
              min=arr[i];
         }
        }
    }
    
	public  static void main (String[] args)
	{

      int arr[]={1,-1,2,34};
      int n=3;
      
	   maxMin(arr,n);
      
      System.out.println("Min is " + min);
      System.out.println("Max is " + max);

	}
}
