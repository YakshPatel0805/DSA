// converts a decimal number to binary using bit manipulation
class Main{
    public static void main(String args[]){
        int n = 23;
        int sum = 0;
        int place = 1;
        while(n > 0){
            int temp = n % 2;
            sum = sum + temp*place;
            place = place * 10;
            n = n / 2;
        }
        System.out.print(sum);
    }
}

// converts a binary number to decimal using bit manipulation
class Main{
    public static void main(String args[]){
        int n = 10111;
        int sum = 0;
        int place = 1;
        while(n > 0){
            int temp = n % 10;
            sum += temp* place;
            place *= 2;
            n = n / 10;
        }
        System.out.print(sum);
    }
}

// find whether ith bit is set-bit or not with both right and left shift operators
class Main{
    public static void main(String args[]){
        int n = 5; 
        int i = 2; 
        // using right shift
        if((n >> i & 1) == 1){
            System.out.println("Set Bit");
        } else {
            System.out.println("Not Set Bit");
        }
        
        // using left shift
        if ((n & (1 << i)) != 0){
            System.out.print("Set Bit");
        }
        else{
            System.out.print("Not Set Bit");
        }
    }
}

// convert ith bit as set-bit
class Main{
    public static void main(String args[]){
        int n = 23; 
        int i = 1; 
        // using left shift
        n = n &(~(1<< i));
        System.out.print(n);
    }
}