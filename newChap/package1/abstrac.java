package newChap.package1;
abstract class Parent{
    Parent(){
        System.out.println("mai hoon parent cons");
    }
    void sayHEllo(){
        System.out.println("HELLO!!!!!!!");
    }
    abstract public void greet();
}
class Child extends Parent{
    public void greet(){
        System.out.println("mushi mushiii");
    }
}
class Child2 extends Parent{
    public void greet(){
        System.out.println("kemchooooo");
    }
}
public class abstrac {
    public static void main(String[] args) {
        Child  ob=new Child();
        Child2 ob2=new Child2();
        ob.greet();
        ob2.greet();
    }
}
