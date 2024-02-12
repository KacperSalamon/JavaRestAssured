package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Logging {
    @Test
    public void loggingMethod(){
        given().baseUri("https://1wtbn3ao24.api.quickmocker.com").config(config.logConfig(LogConfig.logConfig().blacklistHeader("Access-Control-Allow-Headers"))).
                when().get("/articles/1/posts").
                    then().log().ifValidationFails().assertThat().statusCode(200);

    }
}
