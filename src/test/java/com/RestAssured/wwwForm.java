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
import static org.hamcrest.Matchers.*;

public class wwwForm {
    @Test
    public void wwwFormMethod(){
        given().baseUri("https://jsonplaceholder.typicode.com/").config(config().encoderConfig(EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false))).formParam("key1", "value1").
                when().post("posts").
                    then().log().all().assertThat().statusCode(201).body("id", equalTo(101));
    }
}
