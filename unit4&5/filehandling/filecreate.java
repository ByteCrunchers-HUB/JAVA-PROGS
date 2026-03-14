package filehandling;

import java.io.File;

public class filecreate {
    public static void main(String[] args) throws Exception {
        File file=new File("example.txt");
        if(file.exists()){
            System.out.println("File is there in directory");
        }
        else{
            System.out.println("file doesn't exists Creatingg......");
            if(file.createNewFile()){
                System.out.println("Created successfully");
            }
            else{
                System.out.println("Error Ocurred while creating");
            }
        }
        System.out.println(file.getAbsolutePath());
        System.out.println(file.toPath());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.lastModified());
        System.out.println(file.length());
        
    }
}
