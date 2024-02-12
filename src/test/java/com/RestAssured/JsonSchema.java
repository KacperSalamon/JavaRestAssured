package com.RestAssured;
import io.restassured.config.EncoderConfig;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.Header;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class JsonSchema {
    @Test
    public void validateJsonSchem(){
        given().baseUri("https://postman-echo.com/").
                when().get("/get").
                    then().log().all().assertThat().statusCode(200).body(matchesJsonSchemaInClasspath("jsonSchema.json"));
    }
}
