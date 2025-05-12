// Buying - Selling Stocks
class Day7{
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int mini = prices[0];
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < mini) {
                mini = prices[i];
            } else {
                max_profit = Math.max(max_profit, prices[i] - mini);
            }
        }

        System.out.println("Maximum profit: " + max_profit);
    }
}


// right leaders
import java.util.*;

class Day7{
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        ArrayList<Integer> leaders = new ArrayList<Integer>();
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        System.out.println("Leaders in the array: " + leaders);
    }
}


// subArraySum

class Day7{
    public static void main(String args[]){
        int[] arr = {-2, 1 , -3, 4, -1, 2, 1, -5, 4};
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("Maximum subarray sum: " + max);
    }
}