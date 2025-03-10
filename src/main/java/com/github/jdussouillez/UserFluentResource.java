package com.github.jdussouillez;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/user/fluent")
public class UserFluentResource {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public UserFluent get() {
        var user = new UserFluent();
        user.id(2);
        user.name("Fluent");
        return user;
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserFluent create(final UserFluent user) {
        System.out.printf("Create user %s (%s)%n", user, getClass());
        return user;
    }
}
