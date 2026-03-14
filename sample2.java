import java.awt.Point;

public class sample2 {
    public static void main(String[] args) {

        
        int a = 5;
        int b = a;
        a = 7; 

        System.out.print(a + " ");
        System.out.println(b);

        Point p1 = new Point(1, 2);
        Point p2 = p1;

        System.out.print(p1 + " " + p2);
    }
}
