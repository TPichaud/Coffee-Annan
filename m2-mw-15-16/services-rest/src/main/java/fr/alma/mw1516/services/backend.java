import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
*   Created 04/12/2015 - Coffe Annan
**/

@Path("backend")
public class backend {
    private Token token;
    
    @GET
    @Path("bonjour")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBonjour() {
        return Response
                .status(401)
                .type(MediaType.APPLICATION_JSON)
                .entity("Erreur, authentifiez vous!")
                .build();
    }

    @GET
    @Path("callback")
    @Produces(MediaType.APPLICATION_JSON)
    public Response Callback(@PathParam("t") String token) {
        return postToken(token);
    }
    
    @GET
    @Path("token/{t}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sendToken(@PathParam("t") String token){
        
         return Response
                .status(200)
                .build();
        
        
    }
    
    @GET
    @Path("authOK")
    @Produces(MediaType.APPLICATION_JSON)
    public Response authentificationOk() {
        return Response
                .status(200)
                .type(MediaType.APPLICATION_JSON)
                .entity("Vous êtes identifié")
                .build();
    }
    @GET
    @Path("coffeServed")
    @Produces(MediaType.APPLICATION_JSON)
    public Response coffeServed() {
        return Response
                .status(200)
                .type(MediaType.APPLICATION_JSON)
                .entity("Votre café est servi")
                .build();
    }
    
}