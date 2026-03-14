package newChap;
class parent{
    int a=23;
    parent(){
        System.out.println("This is parent cons.");
    }
    void showvalue(){
        System.out.println("the value of parent: "+ a);
    }
}
class child extends parent{
    child(){
        super();//super must be in constructor and in the first line only
    }
   
    void showparentval(){
        super.showvalue();
    }
}
public class superkey {
    public static void main(String[] args) {
        child ob=new child();
        ob.showparentval();
    }
}
