Square Box
----------
class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

Output :

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 



Square Box Outer Line
----------------------
class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(i==1 || i==5 || j==1 || j==5){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}

Output
* * * * * 
*       * 
*       * 
*       * 
* * * * * 


3. Right Diagonal
-----------------
class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(i==1 || i==5 || j==1 || j==5 || j==i){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}

Output
* * * * * 
* *     * 
*   *   * 
*     * * 
* * * * * 


4.Left Diagonal
----------------
class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(i==1 || i==5 || j==1 || j==5 || j==5-i+1){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}

output:

* * * * * 
*     * * 
*   *   * 
* *     * 
* * * * * 


5.Left and Right Diagonal along with Square Box Model

class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(i==1 || i==5 || j==1 || j==5 ||j==i|| j==5-i+1){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }
}

output
-------

* * * * * 
* *   * * 
*   *   * 
* *   * * 
* * * * * 


7.Left Triangle
----------------

class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(j<=i){
                   System.out.print("* ");
               }else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}


class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
               System.out.print("* ");
            }
            System.out.println();
        }
    }
}

Output

*     
* *    
* * *   
* * * *  
* * * * *


class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if( i==j || i==5 || j==1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }
}

Output

* 
* * 
*   * 
*     * 
* * * * *



* My Name Using Patterns *
---------------------------


class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(i==1 ||i==5||j==1||j==5){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(i==j || j==1){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(i==1 ||i==5||j==1||j==5){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        System.out.println();
        
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(j==1 || j==5 || i==5/2+1 ){
                  System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(i==1 || i==5 || j==5/2+1 ){
                  System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        
        
        System.out.println();
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(i==1  || j==5/2+1 ){
                  System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        
        System.out.println();
        
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
               if(j==1 || j==5 || i==5/2+1 ){
                  System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
    }
}


* SAI Name *
-------------

public class SaiName {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || i==5/2+1 || (j==1 && i<5/2+1) || (i>5/2+1 && j==5)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                if((i==1 && j==5/2+1) || (j==1 && i==5) ||(j==5 && i==5) || ((j>1 && j<5)&&i==5/2+1)){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(((j==1 || j==5) && i>5/2+1) || i==5/2+1 || (j==5/2+1 && i==1)|| (i>1 && i<5/2+1 && (j%2==0))){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==5|| j==5/2+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


----------------------

patterns Using Numbers
----------------------

class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                   System.out.print(j+" ");
            }
            System.out.println();
        }
}
}

output:

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 



class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                   System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
}

output:

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 



Questions
----------

1.Prime Number ( Check the number prime or not )
-------------------------------------------------

import java.util.*;
class Main {
    static boolean checkPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if(checkPrime(n)){
           System.out.println("Prime Number");
       }else{
          System.out.println("Not A Prime Number");

       }
    }
}


output
-------
31
Prime Number

33
Not A Prime Number


2.Prime Numbers in given Range
------------------------------

import java.util.*;
class Main {
    static void checkPrime(int n){
        if(n<2){
            System.out.println("No One.");
            return;
        }
        for(int i=2;i<n;i++){
             boolean check = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    check = false;
                }
            }
            if(check){
                System.out.println(i);
            }
        }
        
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       checkPrime(n);
    }
}

output
------
30
2
3
5
7
11
13
17
19
23
29



Amstrong Number
----------------

import java.util.*;
class Main {
    static void amstrongNumber(int n){
        int original = n;
        int temp=0;
        int num =0;
        while(n>0){
            temp = n % 10;
            num += temp*temp*temp;
            n = n/10;
        }
        if(original==num){
            System.out.println("Amstrong Number");
        }else{
            System.out.println("Not an Amstrong Number");

        }
       
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       amstrongNumber(n);
    }
}

output
-------
153
Amstrong Number

152
Not an Amstrong Number
