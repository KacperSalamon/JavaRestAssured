package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.Header;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class ExtractMethods {
    @Test
    public void extractMethod(){
        /*Header objHeader = new Header("header", "valuetest");
        Header objMatchHedaer = new Header("xxxxxx", "yyyyy");


        Headers objHeaders = new Headers(objHeader, objMatchHedaer);*/

        Response response = given().baseUri("https://1wtbn3ao24.api.quickmocker.com").//headers(objHeaders).
                when().get("/articles/1/posts").
                then().log().all().assertThat().statusCode(200).extract().response();

        JsonPath objJsonPath = new JsonPath(response.asString());
        System.out.println("Single response path: " + objJsonPath.getString("results[0].id"));

        //System.out.println("Response body is: " + response.asString());
    }
}
