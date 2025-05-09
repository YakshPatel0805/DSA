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
