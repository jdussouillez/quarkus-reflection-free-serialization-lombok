package com.github.jdussouillez;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/user/fluent-chain")
public class UserFluentChainResource {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public UserFluentChain getFluentChain() {
        return new UserFluentChain()
            .id(4)
            .name("FluentChain");
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserFluentChain create(final UserFluentChain user) {
        System.out.printf("Create user %s (%s)%n", user, getClass());
        return user;
    }
}
