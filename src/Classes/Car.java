package Classes;

public class Car extends Vehicle {
    private  int time=5;
    public  Car(String name,int time){
        super(name);
        setTime(time);
    }
    public  Car(String name ){
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
        System.out.println("the four wheels have been fixed");
   }
}
