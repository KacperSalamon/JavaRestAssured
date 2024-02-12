package com.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.Header;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class LoggingFilter {
    PrintStream filePrint = new PrintStream(new File("restAssured.log"));

    public LoggingFilter() throws FileNotFoundException {
    }

    @Test
    public void validateJsonSchem(){
        given().baseUri("https://postman-echo.com/").filter(new RequestLoggingFilter(filePrint)).filter(new ResponseLoggingFilter(filePrint)).
                when().get("/get").
                then().assertThat().statusCode(200).body(matchesJsonSchemaInClasspath("jsonSchema.json"));
    }
}
