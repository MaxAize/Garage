package DB;
import Classes.*;

import java.util.ArrayList;

public class DB {
    private ArrayList<Vehicle>  Data=new ArrayList();
    public  void  addToData(Vehicle e){
        Data.add(e);
    }
    public  ArrayList<Vehicle> getData()
    {
        return  Data;
    }
}
