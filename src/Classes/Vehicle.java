package Classes;

public abstract class Vehicle implements Fixable {
    protected  String name;

    public  Vehicle(String name){
        setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  abstract  int  getFixTime();
}
