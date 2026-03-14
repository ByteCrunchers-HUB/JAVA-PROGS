import java.util.Scanner;

class CustomErr extends Exception{
     CustomErr(String message){
        super(message);
    }
}
public class custexcep {
    public static void main(String[] args) {
        int balance=10000;
        try{
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter Amt to transact");
            int tr=sc.nextInt();
            if(tr<0){
                throw new CustomErr("Enter a valid amount");
            }
            if(tr>balance){
                throw new CustomErr("Aukaat ke anusaar maaang le bikhari...");
            }

        }
        catch(Exception e){
            System.out.println("Exception Occured: "+e.getMessage());
        }
    }
}