// prefix sum 

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, -6, 4, 0, 5, 2, 3, -1, 0, 7, 8, 9, -3};
        System.out.println(prefixSum(arr));
    }

    public static int prefixSum(int[] arr) {
        int pre = 1;
        int suf = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (pre == 0) {
                pre = 1;
            }
            if (suf == 0) {
                suf = 1;
            }
            pre *= arr[i];
            suf *= arr[arr.length - i - 1];
            ans = Math.max(ans, Math.max(pre, suf));
        }
        return ans;
    }
}

