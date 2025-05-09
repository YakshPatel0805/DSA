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


