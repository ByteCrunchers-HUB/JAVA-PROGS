class Calc{
    int num1;
    int num2;
    Calc(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int add(){
        int r=num1+num2;
        return r;
    }
}
public class Demo{
    public static void main(String[] args) {
        Calc ob=new Calc(23,23);
        System.out.println(ob.add());
    }
}