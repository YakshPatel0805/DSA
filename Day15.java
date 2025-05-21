// Linear Search
class Day15{
    public static void main(String[] args) {
        int target = 14;
        int[] arr = {5,8,11,14,17};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Found at index: " + i);
                break;
            }
        }
    }
}


// Binary Search
class Day15{
    public static void main(String[] args){
        int target = 7;
        k = 4;
        int[] arr = {6,7,8,9,1,2,3,4,5};

        int result = binarySearch(arr, target, k);
        if(result != -1){
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found");
        }
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (right + left) / 2;

            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}


// roteted sorted binary search






// lowerbound and upperbbound
// lowerbound = element >= target
// upperbound = element > target
class Day15{
    public static void main(String[] args){
        int target = 7;
        int[] arr = {6,7,8,9,1,2,3,4,5};

        int lowerBound = lowerBound(arr, target);
        int upperBound = upperBound(arr, target);

        System.out.println("Lower Bound: " + lowerBound);
        System.out.println("Upper Bound: " + upperBound);
    }

    public static int lowerBound(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = (right + left) / 2;

            if(arr[mid] >= target){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }
    public static int upperBound(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = (right + left) / 2;

            if(arr[mid] > target){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }
}

// first and last occurence
