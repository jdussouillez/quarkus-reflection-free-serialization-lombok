package com.github.jdussouillez;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import jakarta.ws.rs.core.MediaType;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestHTTPEndpoint(UserFluentChainResource.class)
class UserFluentChainResourceTest {

    @Test
    public void testGet() {
        RestAssured.given()
            .get()
            .then()
            .statusCode(200)
            .body("id", is(4))
            .body("name", is("FluentChain"));
    }

    @Test
    public void testCreate() {
        RestAssured.given()
            .contentType(MediaType.APPLICATION_JSON)
            .body("""
            {"id": 104, "name": "FluentChain2"}
            """)
            .post()
            .then()
            .statusCode(200)
            .body("id", is(104))
            .body("name", is("FluentChain2"));
    }
}
