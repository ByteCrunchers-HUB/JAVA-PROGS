package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class write {
    public static void main(String[] args) throws IOException{
         FileOutputStream fout=new FileOutputStream("sample.txt");
         byte[] data = {72, 69, 76, 76, 79, 32, 87, 79, 82, 76, 68};
         fout.write(data);
    }
   


}
