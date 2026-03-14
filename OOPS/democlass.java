package OOPS;

public class democlass {
    static class Rectangle{
            
                int length;
                int breadth;
                Rectangle(int length,int breadth){
                    this.length=length;
                    this.breadth=breadth;
                }
                void print(){
                    System.out.println("AREA: "+(length*breadth));
                }
    }
    public static void main(String[] args) {
        Rectangle rec= new Rectangle(12, 14);
        rec.print();
    }
}
