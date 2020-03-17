/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimumpartitiondynamic;

/**
 *
 * @author Misky Reihana A
 */
public class MinimumPartitionDynamic {
// Function to find the minimum sum 
    public static int findMinRec(int arr[], int i, 
                                int sumCalculated, 
                                 int sumTotal) 
    { 
        
        if (i == 0) 
            return Math.abs((sumTotal-sumCalculated) - 
            sumCalculated); 
        return Math.min(findMinRec(arr, i - 1, sumCalculated  
                + arr[i-1], sumTotal), 
                findMinRec(arr, i-1, 
            sumCalculated, sumTotal)); 
    } 
        
    public static int findMin(int arr[], int n) 
    { 
        // Compute total sum of elements 
        int sumTotal = 0; 
        for (int i = 0; i < n; i++) 
            sumTotal += arr[i]; 
       
        // Compute result using recursive function 
        return findMinRec(arr, n, 0, sumTotal); 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int arr[] = {3, 1, 4, 2, 2, 1}; 
        int n = arr.length; 
        System.out.print("The minimum difference"+ 
                        " between two sets is " +  
                         findMin(arr, n)); 
    } 
} 
