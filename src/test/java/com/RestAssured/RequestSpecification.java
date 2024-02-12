package com.RestAssured;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RequestSpecification {
    io.restassured.specification.RequestSpecification requestSpecification;
    @BeforeClass
    public void beforeClassMethod(){
        requestSpecification = with().baseUri("https://api.postman.com").header("x-api-key", "value1");

        //with() i given() można stosować zamiennie - rezultat będzie ten sam :)
    }

    @Test
    public void requestSpecification() {


        given().spec(requestSpecification).
                when().get("/workspaces").
                then().log().all().assertThat().statusCode(401);
    }
}
