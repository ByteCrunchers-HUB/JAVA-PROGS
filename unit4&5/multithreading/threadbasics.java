package multithreading;
class myThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Current thread:"+Thread.currentThread().getName());
            try{
                Thread.sleep(100);
            }
            catch(Exception e){
                System.out.println("Exception Ocurred");
            }
        }
    }
}
public class threadbasics {
    public static void main(String[] args) {
        myThread t1=new myThread();
        myThread t2=new myThread();
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }
}
