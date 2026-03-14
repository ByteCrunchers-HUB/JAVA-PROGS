package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileio  {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("text1.txt");
        FileWriter fw=new FileWriter("text2.txt");
        StringBuffer str=new StringBuffer("");
        int ch;

        while((ch = fr.read()) != -1){
            str.append((char)ch);
        }
        System.out.println(str);
        fw.write(str.toString());
        System.out.println("Written successfully in text2 file ");
        fw.flush();
        fw.close();
        fr.close();

    }
}
