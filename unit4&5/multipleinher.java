interface Teacher{
     static void teaches(){
        System.out.println("Teaching students....");
    }
}
interface Student{
    default void study(){
        System.out.println("Learning from Teacher....");
    }
}
class Person implements Student,Teacher {
    public void study(){
        System.out.println("Person learning....");
    }
    public void teaches(){
        System.out.println("Person Teaching....");
    }
    
}
public class multipleinher {
    public static void main(String[] args) {
        Person p=new Person();
        p.study();
        p.teaches();
        Teacher.teaches();
    }
}
