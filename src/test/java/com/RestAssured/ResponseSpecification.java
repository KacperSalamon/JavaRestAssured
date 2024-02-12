package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ResponseSpecification {
    io.restassured.specification.RequestSpecification requestSpecification;
    io.restassured.specification.ResponseSpecification responseSpecification;
    @BeforeClass
    public void beforeClassMethod(){
        RequestSpecBuilder objBuilder = new RequestSpecBuilder();
        objBuilder.setBaseUri("https://1wtbn3ao24.api.quickmocker.com");
        objBuilder.addHeader("x-api-key", "value1");
        //objBuilder.log(logDetail.ALL);

        requestSpecification = objBuilder.build(); // !!!

        responseSpecification = RestAssured.expect().statusCode(200).contentType(ContentType.JSON);
    }
    @Test
    public void validateStatusCode(){
        given().get("/articles/1/posts").then().spec(responseSpecification).log().all();

    }

    @Test
    public void validateResponseBody(){
        Response response = responseSpecification.given().get("/articles/1/posts").then().log().all().extract().response();
        assertThat(response.path("results[0].content").toString(), equalTo("First post"));
    }
}
