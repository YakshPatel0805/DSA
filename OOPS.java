// Inheritance in Java
// Inheritance is a mechanism in which one class acquires the property of another class.
// here, multiple inheritance is not supported in Java.


// multi-level inheritance
class Main{
    public static void main(String[] args){
        
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        
        int res = obj3.method3(10, 5);
        System.out.print(res);
    }
}

class A{
   static void method1(){
        System.out.println("this is Static method");
    }
    int method2(int a, int b){
        return a + b;
    }
}

class B{
    int method3(int a, int b){
        return a/b;
    }
}

class C extends B, A{
    int method4(int a, int b){
        return a*b;
    }
}



// simple inheritance
class A{
    void method1(){
        System.out.println("this is Static method");
    }
    int method2(int a, int b){
        return a + b;
    }
}
class B extends A{
    int method3(int a, int b){
        return a/b;
    }
}
class Main{
    public static void main(String[] args){
        
        A obj1 = new A();
        B obj2 = new B();

        int res = obj2.method3(10, 5);
        System.out.print(res);
    }
}



// herirachy inheritance
class A{
    void method1(){
        System.out.println("this is Static method");
    }
    int method2(int a, int b){
        return a + b;
    }
}
class B{
    int method3(int a, int b){
        return a/b;
    }
}
class C extends A, B{
    int method4(int a, int b){
        return a*b;
    }
}   
class Main{
    public static void main(String[] args){
        
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        
        int res = obj3.method2(10, 5);
        System.out.print(res);
    }
}



// Polymorphism in Java
// method overloading
class Main{
    public static void main(String[] args){
        
        A obj1 = new A();
        C obj3 = new C();

        int res = obj3.method2(10, 5, 3);
        System.out.print(res);
    }
}

class A{
   static void method1(){
        System.out.println("this is Static method");
    }
    int method2(int a, int b){
        return a + b;
    }
    
    int method2(int a, int b, int c){
        return a*b*c;
    }
}

class C extends A{
    int method4(int a, int b){
        return a - b;
    }
}


// method overriding
class Main{
    public static void main(String[] args){
        
        A obj1 = new A();
        C obj3 = new C();

        int res = obj3.method2(10, 3);
        System.out.print(res);
    }
}

class A{
   static void method1(){
        System.out.println("this is Static method");
    }
    int method2(int a, int b){
        return a + b;
    }
    
    int method2(int a, int b, int c){
        return a*b*c;
    }
}

class C extends A{
    int method2(int a, int b){
        return a - b;
    }
}



// Encapsulation in Java
class Day2{
    public static void main(String args[]){
        Student obj = new Student();
        
        obj.setAge(21);
        obj.setName("Yaksh");
        obj.setPass(true);
        obj.setMarks(50);
        obj.setERP(220303110);
        
        String b = obj.getName();
        int res = obj.getAge();
        boolean c = obj.getPass();
        float d = obj.getMarks();
        long e = obj.getERP();
        
        System.out.println("Name: " + b);
        System.out.println("Age: " + res);
        System.out.println("Passed: " + c);
        System.out.println("Marks: " + d);
        System.out.println("ERP: " + e);

    }
}

class Student{

    private int age;
    private String name;
    private boolean passedout;
    private float marks;
    private long ERP;
    
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    
    void setMarks(float marks){
        this.marks = marks;
    }
    float getMarks(){
        return marks;
    }
    
    void setPass(boolean passedout){
        this.passedout = passedout;
    }
    boolean getPass(){
        return passedout;
    }
    
    void setERP(long ERP){
        this.ERP = ERP;
    }
    long getERP(){
        return ERP;
    }

}



// Abstraction in Java
// in class A, method1 is abstract and incompelete in class B, method1 is decleared.
// if you want to use abstract method, you have to use it in child class.

class Main{
    public static void main(String args[]){
        B obj = new B();
        int res = obj.method1(10,5);
        System.out.print(res);
    }
}
abstract class A{
    abstract int method1(int a, int b);
}
class B extends A{
    int method1(int a, int b){
        return a + b;
    }
}



// Abstraction using Interface.
// here must use public access modifier.
class Main{
    public static void main(String args[]){
        B obj = new B();
        int res = obj.method1(10,5);
        System.out.print(res);
    }
}
interface  A{
    public int method1(int a, int b);
}
class B implements A{
    public int method1(int a, int b){
        return a + b;
    }
}