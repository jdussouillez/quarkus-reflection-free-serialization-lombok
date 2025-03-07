package com.github.jdussouillez;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import jakarta.ws.rs.core.MediaType;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestHTTPEndpoint(UserFluentResource.class)
class UserFluentResourceTest {

    @Test
    public void testGet() {
        RestAssured.given()
            .get()
            .then()
            .statusCode(200)
            .body("id", is(2))
            .body("name", is("Fluent"));
    }

    @Test
    public void testCreate() {
        RestAssured.given()
            .contentType(MediaType.APPLICATION_JSON)
            .body("""
            {"id": 102, "name": "Fluent2"}
            """)
            .post()
            .then()
            .statusCode(200)
            .body("id", is(102))
            .body("name", is("Fluent2"));
    }
}
