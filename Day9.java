// from a given string we have to a character using recursion.

class Day9 {
    public static void main(String[] args) {
        String str = "asdfghj";
        System.out.print(removeChar(str));
    }
    
    static String removeChar(String str){
        if (str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'g'){
            return removeChar(str.substring(1));
        }
        else{
            return ch + removeChar(str.substring(1));
        }
    }
}



// reverse an array using two pointers
import java.util.*;
class Day9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}