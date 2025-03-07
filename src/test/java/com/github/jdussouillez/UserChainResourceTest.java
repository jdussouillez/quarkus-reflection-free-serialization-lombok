package com.github.jdussouillez;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import jakarta.ws.rs.core.MediaType;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestHTTPEndpoint(UserChainResource.class)
class UserChainResourceTest {

    @Test
    public void testGet() {
        RestAssured.given()
            .get()
            .then()
            .statusCode(200)
            .body("id", is(3))
            .body("name", is("Chain"));
    }

    @Test
    public void testCreate() {
        RestAssured.given()
            .contentType(MediaType.APPLICATION_JSON)
            .body("""
            {"id": 103, "name": "Chain2"}
            """)
            .post()
            .then()
            .statusCode(200)
            .body("id", is(103))
            .body("name", is("Chain2"));
    }
}
