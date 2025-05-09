// Arrays

class Day5{
    public static void main(String args[]){

        int arr[] = {1, 2, 3, 4, 5};
        
        // Production level code in camel case
        void printArray(int[] arr){
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }

    }
}


// Take an array input from the user and print the array.

import java.util.*;
class Day5{
    public static void main(String args[]){
        int arr[] = new int[5];
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value seperaed by space: ");
        for(int i=0; i<arr.length; i++){
          arr[i] = sc.nextInt();;
        }
        System.out.print(Arrays.toString(arr));
    }
}

// print highest and second highest number in an array.
import java.util.*;
class Day5{
    public static void main(String args[]){
        int arr[] = {1,5,7,2,9};
        int maxVal = arr[0];
        int secondHighest = arr[0];
        // Scanner sc = new Scanner(System.in);
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        for(int i = 1; i<arr.length;i++){
            if (arr[i] > secondHighest && arr[i] != maxVal){
                secondHighest = arr[i];
            }
        }
        System.out.println("Highest Value: " +maxVal+" Second Highest Value: "+secondHighest);
    }
}


    // check array is sorted or not
        // int[] arr = {1,2,5,4,9};
        // for (int i = 0; i<(arr.length)-1;i++){
        //     if (arr[i] > arr[i+1]){
        //         System.out.print("Not sorted ");
        //         break;
        //     }
        // }
        

    // check if element is present in the array or not
        // int ele = 10;
        // for(int i = 0; i<arr.length;i++){
        //     if (arr[i] == ele){
        //         System.out.print("Element present");
        //         break;
        //     }
        // }
        // System.out.print("Element is not present");
        
        
    // move all zeroes to the end of the array when given an array of 0's and 1's
