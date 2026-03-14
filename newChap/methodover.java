package newChap;
class method{
    void m1(){
        System.out.println("method 1");
    }
    void m1(int a,String b){
        System.out.println("method 2");
    }
    void m1(String b,int a){
        System.out.println("method 3");
    }
    void m1(double b){
        System.out.println("method 4");
    }
}
public class methodover {
    public static void main(String[] args) {
        method ob=new method();
        ob.m1(1.232d);
    }
    
}