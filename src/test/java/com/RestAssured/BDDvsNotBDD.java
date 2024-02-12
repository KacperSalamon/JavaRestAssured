package com.RestAssured;

import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BDDvsNotBDD {
    io.restassured.specification.RequestSpecification requestSpecification;
    @BeforeClass
    public void beforeClassMethod(){
        requestSpecification = with().baseUri("https://1wtbn3ao24.api.quickmocker.com").header("x-api-key", "value1");

        //with() i given() można stosować zamiennie - rezultat będzie ten sam :)
    }

    @Test
    public void BDD() {


        given().spec(requestSpecification).
                when().get("/articles/1/posts").
                then().log().all().assertThat().statusCode(200).body("results.content", contains("First post", "Second post", "Third post"));
    }
    //notBDD
    @Test
    public void validateStatusCode(){
        Response response = requestSpecification.get("/articles/1/posts").then().log().all().extract().response();
        assertThat(response.statusCode(), is(equalTo(200)));

    }

    @Test
    public void validateResponseBody(){
        Response response = requestSpecification.get("/articles/1/posts").then().log().all().extract().response();
        assertThat(response.statusCode(), is(equalTo(200)));
        assertThat(response.path("results[0].content").toString(), equalTo("First post"));
    }
}
