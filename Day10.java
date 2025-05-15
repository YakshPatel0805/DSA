// reverse a string
import java.util.*;

class Day10 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.print(reverseString(str));
    }

    static String reverseString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        return reverseString(str.substring(1)) + ch;
    }
}



// reverse an string using two pointers
// class Day9 {
//     public static void main(String[] args) {
//         String arr1 = "Hello";
//         char[] arr = arr1.toCharArray();
//         reverse(arr);
//         System.out.print(Arrays.toString(arr));
//     }

//     static void swap(char[] arr, int i, int j) {
//         char temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void reverse(char[] arr) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {
//             swap(arr, start, end);
//             start++;
//             end--;
//         }
//     }
// }
