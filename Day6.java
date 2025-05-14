// 2D array
import java.util.*;
class Day6 {
    public static void main(String[] args) {
        // int[][] arr = new int[2][3];
        Scanner in = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the size of the array: ");
        int rows = in.nextInt();
        int column = in.nextInt();
        int[][] arr = new int[rows][column];
        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // Input the array
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j] = in.nextInt();
        //     }
        // }
        // Print the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}



import java.util.*;
class Main {
    public static void main(String[] args) {
        
        // int[] arr = {1,0,1,0,1,1,1,0,1,1};
        // System.out.print(maxConsuctiveOnes(arr));
        
        int[] arr = {1,2,3,5,6,7};
        System.out.print(missingElement(arr));
        
    }
    
    // static int maxConsuctiveOnes(int[] arr){
    //     int count = 0;
    //     int max = 0;
        
    //     for(int i = 0; i<arr.length;i++){
    //         if(arr[i] == 0){
    //             count = 0;
    //         }
    //         else{
    //             count+=1;
    //             max = Math.max(count, max);
    //         }
    //     }
    //     return max;
    // }
    
    static int missingElement(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            if (arr[i+1] - arr[i] == 1){
                continue;
            }
           return (arr[i]+1);
        }
        return 0;
    }
}