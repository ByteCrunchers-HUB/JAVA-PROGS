 interface Transport {
    void getsetgo();
}
abstract  class Vehicle implements Transport{
    private int nooftires;
    Vehicle(int nooftires){
        this.nooftires=nooftires;
    }
    public void getsetgo(){
        System.out.println("chaloooooooo......");
    }
    int getNooftires(){
        return nooftires;
    }
    void setNooftires(int nooftires){
        this.nooftires=nooftires;
    }
    void commute(){
        System.out.println("going......");
    }
    abstract  void start();//should be compulasry defined

}
class Car extends Vehicle{
    private int noofdoors;
    Car(int noofdoors,int nooftires){
        super(2);
        this.noofdoors=noofdoors;
    }
    void start(){
        System.out.println("putttt.ptuttttt");
    }

}
class Bike extends Vehicle{
    private int noofdoors;
    Bike(int noofdoors,int nooftires){
        super(2);
        this.noofdoors=noofdoors;
    }
    void start(){
        System.out.println("phurrrr phurrrrrr");
    }

}
public class Testabstract {

    public static void main(String[] args) {
        Car c1=new Car(4,4);
        c1.start();
        Bike b1=new Bike(0, 2);
        b1.start();
        b1.getsetgo();
    }
}