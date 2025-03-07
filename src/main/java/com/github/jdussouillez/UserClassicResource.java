package com.github.jdussouillez;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/user/classic")
public class UserClassicResource {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public UserClassic get() {
        var user = new UserClassic();
        user.setId(1);
        user.setName("Classic");
        return user;
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserClassic create(final UserClassic user) {
        System.out.println("Created user: " + user);
        return user;
    }
}
