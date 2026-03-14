import java.util.Scanner;

abstract class Shape{
    abstract void calculateArea();
}
class Circle extends Shape{
    void calculateArea(){
        int radius;
        Scanner sc=new Scanner(System.in);
        radius=sc.nextInt();
        System.out.println("Area="+Math.PI*radius*radius);
    }
}
class Square extends Shape{
    void calculateArea(){
        int side;
        Scanner sc=new Scanner(System.in);
        side=sc.nextInt();
        System.out.println("Area="+side*side);
    }
}
public class q1 {
    public static void main(String[] args) {
        Shape c=new Circle();
        c.calculateArea();
    }
}
