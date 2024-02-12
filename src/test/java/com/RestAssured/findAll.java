package com.RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.Header;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItems;

public class findAll {

    io.restassured.specification.RequestSpecification requestSpecification;

    @BeforeClass
    public void beforeClassMethod() {
        RequestSpecBuilder objBuilder = new RequestSpecBuilder();
        objBuilder.setBaseUri("https://jsonplaceholder.typicode.com/");
        objBuilder.addHeader("x-api-key", "value1");
        //objBuilder.log(logDetail.ALL);

        requestSpecification = objBuilder.build();

    }
    @Test
    public void findAllMethod(){

        String json = "{\n" +
                "    \"store\": {\n" +
                "        \"book\": [\n" +
                "            {\n" +
                "                \"author\": \"Nigel Rees\",\n" +
                "                \"category\": \"reference\",\n" +
                "                \"price\": 8.95,\n" +
                "                \"title\": \"Sayings of the Century\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"author\": \"Evelyn Waugh\",\n" +
                "                \"category\": \"fiction\",\n" +
                "                \"price\": 12.99,\n" +
                "                \"title\": \"Sword of Honour\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"author\": \"Herman Melville\",\n" +
                "                \"category\": \"fiction\",\n" +
                "                \"isbn\": \"0-553-21311-3\",\n" +
                "                \"price\": 8.99,\n" +
                "                \"title\": \"Moby Dick\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"author\": \"J. R. R. Tolkien\",\n" +
                "                \"category\": \"fiction\",\n" +
                "                \"isbn\": \"0-395-19395-8\",\n" +
                "                \"price\": 22.99,\n" +
                "                \"title\": \"The Lord of the Rings\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"id\": 101\n" +
                "}";

        given().spec(requestSpecification).body(json).
                when().post("posts").
                        then().log().all().assertThat().statusCode(201).contentType(ContentType.JSON);
                //body("store.book.findAll { it.price < 10 }.title", hasItems("Sayings of the Century", "Moby Dick"));
                //body("id.length().sum()", greaterThan(1));

    }
}
