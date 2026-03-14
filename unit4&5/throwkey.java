import java.util.Scanner;

public class throwkey {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no");
        a=sc.nextInt();
        System.out.println("Enter the second no");
        b=sc.nextInt();
        try{
            if(b==0){
                throw new ArithmeticException("kya bhaii tummmm!!!!!!");
            }
            else{
                System.out.println(a/b);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
