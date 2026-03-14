package multithreading;
class myThread implements Runnable{
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
public class th{
    public static void main(String[] args) {
        myThread ob1=new myThread();
        myThread ob2=new myThread();
        Thread t1=new Thread(ob1, "A");
        Thread t2=new Thread(ob2,"B");
        // t1.start();
        t2.start();
        t1.start();
    }
}
