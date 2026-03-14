package newChap;
class Student{
    static int roll=21,marks=32;
    // Student(){
    //     roll=21;
    //     marks=34;
    // }
    // static void printroll(){
    //     System.out.println(roll);
    // }
    void printroll(){
         System.out.println(this.roll);
    }

}

public class jtc {
    public static void main(String[] args) {
        new Student().printroll();
        
    }
}
