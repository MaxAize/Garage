package Classes;

public class Truck  extends Vehicle {
    private  int time=10;
    public  Truck(String name,int time){
        super(name);
        setTime(time);
    }
    public  Truck(String name ){
        super((name));
    }
    private   void  setTime(int time){
        if(time>=0){
            this.time=time;
        }
    }
    public int getFixTime(){
        return  this.time;
    }
    public  void fixed(){
        System.out.println("the ten wheels have been fixed");
    }
}
