package com.erbil.rest.jersey;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.erbil.mps.ServiceBean;

@Path("rest") 
public class JerseyServices {
		
	 @GET
	 @Path("/allLogsMockList") // route to a specific method.re
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<String>  getAll() {
		 ServiceBean service = new ServiceBean();
		 return service.allLogsMock();
	 }
	
}
