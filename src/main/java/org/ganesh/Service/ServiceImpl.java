package org.ganesh.Service;

import org.ganesh.Entity.Vehicles;

import javax.enterprise.context.ApplicationScoped;
import java.util.*;

@ApplicationScoped
public class ServiceImpl implements Service {

    List<Vehicles> list =new ArrayList<>();

    @Override
    public Vehicles addVehicle(String name) {



        if(name.equals("Car")){
         Vehicles v1 = new Vehicles("Car",500,"In Garage");
          this.list.add(v1);
          return v1;

        }
       else if (name.equals("Bike")){
            Vehicles v2 = new Vehicles("Bike",200,"In Garage");
             this.list.add(v2);

             return v2;
        }
       else {
           return null;
        }

    }

    @Override
    public List<Vehicles> getVehicle() {


        return list;

    }



}
