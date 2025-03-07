package com.github.jdussouillez;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import jakarta.ws.rs.core.MediaType;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(UserClassicResource.class)
class UserClassicResourceTest {

    @Test
    public void testGet() {
        RestAssured.given()
            .get()
            .then()
            .statusCode(200)
            .body("id", is(1))
            .body("name", is("Classic"));
    }

    @Test
    public void testCreate() {
        RestAssured.given()
            .contentType(MediaType.APPLICATION_JSON)
            .body("""
            {"id": 101, "name": "Classic2"}
            """)
            .post()
            .then()
            .statusCode(200)
            .body("id", is(101))
            .body("name", is("Classic2"));
    }
}
