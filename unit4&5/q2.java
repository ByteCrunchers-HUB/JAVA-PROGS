interface Flyable {
    void fly();
}
abstract class Bird implements Flyable{
    public void xyz(){
        System.out.println("Hello everyone!!!");
    }
}
class Eagle extends Bird{
    public void fly(){
        System.out.println("Eagle is flying........(( : ))" );
    }
}
public class q2 {
    public static void main(String[] args) {
        Eagle e=new Eagle();
        e.fly();
    }
}
