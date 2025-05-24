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

    int age;
    String name;
    boolean passedout;
    float marks;
    long ERP;
    
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



// reverse a number 123 -> 321
class Main{
    public static void main(String args[]){

        int num = 123;
        int temp = 0;
        while(num > 0){
            temp = temp*10 + (num % 10);
            num = num / 10;
        }
        System.out.print(temp);
    }
}