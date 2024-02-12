package com.RestAssured;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.with;
import static org.hamcrest.Matchers.not;

public class ArrayAsList {
    io.restassured.specification.RequestSpecification requestSpecification;
    @BeforeClass
    public void beforeClassMethod() {
        requestSpecification = with().baseUri("https://jsonplaceholder.typicode.com/").header("x-api-key", "value1");
    }
    @Test
    public void postArrayAsList(){
        HashMap<String, String> obj55 = new HashMap<String, String>();
        HashMap<String, String> obj45 = new HashMap<String, String>();

        obj55.put("id", "55");
        obj55.put("type", "Alone");

        obj45.put("id", "45");
        obj45.put("type", "Familiar");

        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        list.add(obj55);
        list.add(obj45);



        given().body(list).
                when().post("posts").
                        then().log().all().assertThat().statusCode(200);
    }
}
