package newChap;
import java.util.*;
class Grandfather{
    String name;
    Grandfather(){
        System.out.println("Grandfather here!");
    }
    
}
class father extends Grandfather{
    father(){
        System.out.println("father here!");
    }
   
}
class son extends father{
    son(){
        System.out.println("son here!");
    }
    
}

public class multilevel {
    public static void main(String[] args) {
        son ob=new son();
    }
}
