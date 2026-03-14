class Demo{
    int x;
    static int count=0;
    Demo(int x){ 
        this.x=x;
        count++;
    }
    void children(){
        System.out.println(count);
    }
}
class Static{
    public static void main(String[] args){
        
        Demo ob1=new Demo(10);
        ob1.count=40;
        Demo ob2=new  Demo(20);
        ob2.count=22;
        ob2.children();
    } 
}