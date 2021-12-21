package org.ganesh.Controller;

import org.ganesh.Entity.Vehicles;
import org.ganesh.Service.ServiceImpl;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/garage")
public class Controller {

    @Inject
    ServiceImpl imp;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<Vehicles>getVehicles(){

        return imp.getVehicle();
    }

    @POST
    @Path("{name}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public Vehicles addVehicles(@PathParam("name") String name){
        return imp.addVehicle(name);
    }



}
