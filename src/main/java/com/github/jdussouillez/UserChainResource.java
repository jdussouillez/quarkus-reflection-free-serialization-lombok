package com.github.jdussouillez;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/user/chain")
public class UserChainResource {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public UserChain get() {
        return new UserChain()
            .setId(3)
            .setName("Chain");
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserChain create(final UserChain user) {
        System.out.println("Created user: " + user);
        return user;
    }
}
