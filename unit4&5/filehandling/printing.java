package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class printing {
    public static void main(String[] args) throws IOException{
        FileInputStream fin= new FileInputStream("text.txt");
        int curr=fin.read();
        while(curr!=-1){
            System.out.print((char)curr);
            curr=fin.read();
        }
    }
    
}