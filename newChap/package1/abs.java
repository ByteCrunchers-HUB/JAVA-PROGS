package newChap.package1;
abstract class Shape{
    void speak(){
        System.out.println("i am shape class");
    }
    abstract void getarea();
}
 class Circle extends Shape{
    void speak(){
        System.out.println("i am Circle class");
    }
    void getarea(){
        System.out.println("pi *r *r");
    }
}
class Rec extends Shape{
    void speak(){
        System.out.println("i am Rec class");
    }
    void getarea(){
        System.out.println("l*b");
    }
}
public class abs {
    public static void main(String[] args) {
        Rec ob=new Rec();
        ob.getarea();
    }
}
