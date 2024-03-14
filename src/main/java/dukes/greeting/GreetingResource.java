package dukes.greeting;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;


@Path("greeting")
public class GreetingResource {

    @Inject
    private GreetingService greetingService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public GreetingRecord greetingRecord() {
        return greetingService.getGreeting();
    }

}
