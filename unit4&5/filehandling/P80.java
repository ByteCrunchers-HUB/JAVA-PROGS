package filehandling;

import java.io.FileInputStream;

public class P80 {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("text.txt");
            int a1=fin.read();
            int a2=fin.read();
            int a3=fin.read();
            fin.skip(12);
            byte[] b=new byte[3];
            int a4=fin.available();
            System.out.printf("%d ",a1,a2,a3);
            fin.close();
        }
        catch(Exception e){
            System.out.println("Exception Occured"+e.toString());
        }
    }
}
