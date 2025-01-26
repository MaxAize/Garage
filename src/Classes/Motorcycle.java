package Classes;

public class Motorcycle extends Vehicle {
    private  int time=3;
    public   Motorcycle(String name,int time){
        super(name);
        setTime(time);
    }
    private   void  setTime(int time){
        if(time>=0){
            this.time=time;
        }
    }
    public  Motorcycle(String name ){
        super((name));
    }
    public int getFixTime(){
        return  this.time;
    }
    public  void fixed(){
        System.out.println("the two wheels have been fixed");
    }
}
