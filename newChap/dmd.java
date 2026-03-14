package newChap;
class Animal{
    void speak(){
        System.out.println("huhu");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("BOWWWW!!!!!!");
    }
}
public class dmd {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.speak();
    }
}
