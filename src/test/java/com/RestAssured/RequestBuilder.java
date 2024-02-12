package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.with;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RequestBuilder {

    io.restassured.specification.RequestSpecification requestSpecification;
    @BeforeClass
    public void beforeClassMethod(){
        /*requestSpecification = with().baseUri("https://1wtbn3ao24.api.quickmocker.com").header("x-api-key", "value1");

        //with() i given() można stosować zamiennie - rezultat będzie ten sam :)*/

        RequestSpecBuilder objBuilder = new RequestSpecBuilder();
        objBuilder.setBaseUri("https://1wtbn3ao24.api.quickmocker.com");
        objBuilder.addHeader("x-api-key", "value1");
        //objBuilder.log(logDetail.ALL);

        requestSpecification = objBuilder.build(); // !!!



    }

    @Test
    public void query(){
        QueryableRequestSpecification queryableRequestSpecification = SpecificationQuerier.query(requestSpecification);
        System.out.println(queryableRequestSpecification.getBaseUri());
        System.out.println(queryableRequestSpecification.getHeaders());
    }
    @Test
    public void validateStatusCode(){
        Response response = given().spec(requestSpecification).get("/articles/1/posts").then().log().all().extract().response();
        assertThat(response.statusCode(), is(equalTo(200)));

    }

    @Test
    public void validateResponseBody(){
        Response response = given().spec(requestSpecification).get("/articles/1/posts").then().log().all().extract().response();
        assertThat(response.statusCode(), is(equalTo(200)));
        assertThat(response.path("results[0].content").toString(), equalTo("First post"));
    }
}
