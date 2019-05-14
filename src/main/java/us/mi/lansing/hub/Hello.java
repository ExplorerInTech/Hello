package us.mi.lansing.hub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/sayHello")
public class Hello {
	
	@GET
	@Produces({ MediaType.TEXT_PLAIN })
    public Response getHeartBeat() {
        return Response.ok("Hello").build();
    }

}
