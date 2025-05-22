// prefix sum of given range from array.

class Day16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 2;
        int right = 4;
        int[] pre = new int[arr.length];
        
        pre[0] = arr[0];
        for(int i = 1; i<arr.length;i++){
            pre[i] = pre[i-1] + arr[i];
        }
        
        if(left == 0){
            System.out.print(pre[right]);
        }
        else{
            System.out.print(pre[right] - pre[left - 1]);
        }
    }
}


// roteted sorted binary search
import java.util.*;

public class Main {
    public static int findMin(int[] arr) {
        int l = 0, h = arr.length - 1;

        while (l < h) {
            if (arr[l] < arr[h]) {
                return arr[l];
            }
            int mid = (l + h) / 2;
            if (arr[mid] > arr[h]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return arr[l];
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(findMin(arr));
    }
}