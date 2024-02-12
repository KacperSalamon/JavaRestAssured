package com.RestAssured.PUT;
import io.restassured.builder.RequestSpecBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.Socket;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class PUT {
    io.restassured.specification.RequestSpecification requestSpecification;


    @BeforeClass
    public void beforeClassMethod() {
        RequestSpecBuilder objBuilder = new RequestSpecBuilder();
        objBuilder.setBaseUri("https://jsonplaceholder.typicode.com/");
        objBuilder.addHeader("x-api-key", "value1");
        //objBuilder.log(logDetail.ALL);

        requestSpecification = objBuilder.build(); // !!!
    }

    @Test
    public void putMethod(){
        String payload = "{\n" +
                "        \"userId\": 1,\n" +
                "        \"id\": 1,\n" +
                "        \"title\": \"xxxxxx123\",\n" +
                "        \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "}";
        given().body(payload).
                when().put(payload).
                    then().assertThat().statusCode(200);
    }
}
