import java.util.Scanner;

public class disp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter u: ");
        float u = sc.nextFloat();

        System.out.print("Enter t: ");
        float t = sc.nextFloat();

        System.out.print("Enter a: ");
        float a = sc.nextFloat();

        float s = (u * t) + (0.5f * a * (t * t));

        System.out.println("Displacement (s) = " + s);

        sc.close();
    }
}
