package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Matchers {
    @Test
    public void matchersTestCases(){
        for (int i = 0; i < 10; i++){
            String random = "test" + i;
            System.out.println(random);
        }


        String str = "";
        given().baseUri("https://1wtbn3ao24.api.quickmocker.com").log().all().
                when().get("/articles/1/posts").
                then().log().all().assertThat().statusCode(200).
                body("results.id", contains(5,6,7),
                        "results.id", is(not(empty())),
                        "results.content", is(not(everyItem(startsWith("First")))),
                        "results[0]", hasKey("id"),
                        "results[0]", is(not(hasValue(str))),
                        "results[1]", hasEntry("content", "Second post"));//przy contains musimy ustawić w poprawnej kolejności dane wartości
                //jeśli jednak zastosujemy metodę containsInAnyOrder - możemy podać losową kolejność - przykład poniżej
                //then().log().all().assertThat().statusCode(200).body("results.id", containsInAnyOrder(6,7,5));

    }

}
