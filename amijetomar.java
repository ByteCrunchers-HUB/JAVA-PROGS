import java.util.Scanner;

public class amijetomar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("one");
                break;
             case 2:
                System.out.println("two");
                break;
             case 3:
                System.out.println("three");
                break;
        
            default:
                System.out.println("bhakk");
                break;
        }
    }
}
