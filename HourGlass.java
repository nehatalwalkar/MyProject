package te;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * Program 
 
 *   Given a  2D Array 6 x 6, :

		1 1 1 0 0 0
		0 1 0 0 0 0
		1 1 1 0 0 0
		0 0 0 0 0 0
		0 0 0 0 0 0
		0 0 0 0 0 0
	
	We define an hourglass in A to be a subset of values with indices falling in this pattern in Arr's graphical representation:

		a b c
  		  d
		e f g
	There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values. 
	Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.

	For example, given the 2D array:

		-9 -9 -9  1 1 1 
 		 0 -9  0  4 3 2
		-9 -9 -9  1 2 3
 		 0  0  8  6 6 0
 		 0  0  0 -2 0 0
 		 0  0  1  2 4 0
	
	We calculate the following 16 hourglass values:

		-63, -34, -9, 12, 
		-10,  0,  28, 23, 
		-27, -11, -2, 10, 
		  9, 17,  25, 18
Our highest hourglass value is  from the hourglass: 28
 * */


public class HourGlass {

    // Complete the hourglassSum function below.
	
    static int hourglassSum(int[][] arr) {
   
    	
    	
    	
    	int [][] additionHorizontalArray = new int[6][4];
    	
    	//Add row values in group of 3 and store them in 6 by 4 array
    	
    	for(int i = 0; i < 6 ; i++) {
    		
    		for(int j = 0; j < 4 ; j++) {
    			
    			additionHorizontalArray[i][j] = arr[i][j] + arr[i][j+1] + arr[i][j+2];
    			
    			
    			
    		}
    	
    	}
    	/*
    	 * Display 6 by 4 array if needed for debug
    	System.out.println(" ");
	for(int i = 0; i < 6 ; i++) {
    		
    		for(int j = 0; j < 4 ; j++) {
    			
    			System.out.print(additionHorizontalArray[i][j]+ " ");
    			
    			
    			
    		}
    	
    	}*/
	
	//Create an hourglass sum in one dimensional array
	int addirionArray[] = new int[16];
	int k = 0;
	
	for(int i = 0 ; i < 6 ; i ++) {
		
		for (int j = 0 ; j <4 ; j++) {
			
			if(k == 16)
				break;

			addirionArray[k] = additionHorizontalArray[i][j] + arr[i+1][j+1] +additionHorizontalArray[i+2][j];
			
			k++;
			
		}
	}
	
	//Find the maximum number in an array
	int max = addirionArray[0];
	for(int i = 0 ; i < 16 ; i++) {
		System.out.println("max:"+max);
		 if(max < addirionArray[i])
			 max = addirionArray[i];
		
	}
	
		
    	
    	return max;
    }

   
    public static void main(String[] args) throws IOException {
      
        int[][] arr = new int[6][6];


        
        
        Random rand = new Random();
       
        
        for(int i = 0 ; i < 6 ; i++) {
        	for (int j = 0 ; j < 6 ; j ++) {
        		
        		arr[i][j] = rand.nextInt(10);
        	}
        }
      
        
        for(int i = 0 ; i < 6 ; i++) {
        	for (int j = 0 ; j < 6 ; j ++) {
        		
        		System.out.print(arr[i][j] + " ");
        	}
        }
         

    }
}

