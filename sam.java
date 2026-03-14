import java.util.Scanner;

public class sam {
    public static void main(String[] args) {
        // final int  var=31;
        // System.out.println(var);
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter your age");
        int age=sc.nextInt();

        System.out.println(name+" "+age);
    }
}
