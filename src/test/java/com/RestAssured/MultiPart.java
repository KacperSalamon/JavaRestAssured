package com.RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class MultiPart {
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
    public void postMethod(){
        String atributtes = "test";
        /*String payload = "{\n" +
                "        \"userId\": 1,\n" +
                "        \"id\": 1,\n" +
                "        \"title\": \"test\",\n" +
                "        \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "}";*/
        given().spec(requestSpecification).multiPart("file", new File("C:/Users/Kacper Salamon/Desktop/file.txt")).multiPart("attributes", atributtes).//wysłanie za pomocą plików
                //multiPart("foo1", "bar1") - tak również możemy przekazywać form-data
                when().post("posts").
                then().log().all().assertThat().statusCode(201).body(is(not(empty())));

    }
}
