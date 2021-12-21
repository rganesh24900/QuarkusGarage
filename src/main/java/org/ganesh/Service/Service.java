package org.ganesh.Service;

import org.ganesh.Entity.Vehicles;

import java.util.List;

public interface Service {

    Vehicles addVehicle(String name);

    List<Vehicles> getVehicle();

//    Vehicles updateVehicles(int id);

}
