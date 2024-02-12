package com.RestAssured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredMain {
    @Test
    /*public void test(){
        given().baseUri("https://api.postman.com").
                header("x-api-key", "test").
                when().get("/workspaces").
                        then().log().all().assertThat().statusCode(401).body("error", hasItems());
    }*/

    public void szkolawChmurzeTest(){
        given().baseUri("https://1wtbn3ao24.api.quickmocker.com").//param("foo1", "baar2"). - za pomocą słowa param() można definiować query parameter w celu (przykładowo) zmieniejszenia wyników wyszukiwania
                //queryParam() używamy kiedy chcemy zdefiniować WIĘCEJ NIŻ JEDEN parametr
                        //queryParam("foo1", "first", "second", "third") LUB queryParam("foo1", "first"; "second"; "third") --> można oddzielać przecinkiem lub średnikiem!
                when().get("/articles/1/posts").
                then().log().all().assertThat().statusCode(200).body("results.id", hasItems(5, 6, 7), "results.size()", equalTo(3));
    }
}
